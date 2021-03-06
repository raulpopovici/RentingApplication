package services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import exceptions.EmptyFieldsException;
import org.apache.commons.io.FileUtils;
import exceptions.CouldNotWriteUsersException;
import exceptions.UsernameAlreadyExistsException;
import usermodel.User;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Objects;

public class UserService {

    public static List<User> users;
    public static Path USERS_PATH = FileSystemService.getPathToFile("config", "users.json");

    public static void loadUsersFromFile() throws IOException {

        if (!Files.exists(USERS_PATH)) {
            FileUtils.copyURLToFile(UserService.class.getClassLoader().getResource("users.json"), USERS_PATH.toFile());
        }

        ObjectMapper objectMapper = new ObjectMapper();

        users = objectMapper.readValue(USERS_PATH.toFile(), new TypeReference<List<User>>() {
        });
    }

    public static void addUser(String username, String password, String firstName,String lastName,String phoneNumber,String address,String role) throws UsernameAlreadyExistsException {
        if(!checkUserDoesNotAlreadyExist(username)){
            users.add(new User(username,encodePassword(username, password),firstName,lastName,phoneNumber,address,role));
            persistUsers();
        }

    }

    public static boolean checkUserDoesNotAlreadyExist(String username) throws UsernameAlreadyExistsException {
        for (User user : users) {
            if (Objects.equals(username, user.getUsername()))
                throw new UsernameAlreadyExistsException(username);
                //return true;

        }
        return false;
    }

    public static boolean checkEmptyFields(String passwordField,String usernameField,String role,String firstNameField,String lastNameField,String phoneNumberField,String addressField){
        if(passwordField.equals("")  || usernameField.equals("") || role == null || firstNameField.equals("")  || lastNameField.equals("")  || phoneNumberField.equals("")  || addressField.equals("") ){
            return false;
        }
        return true;

    }



    public static boolean checkIfPassAndUserAreValid(String username,String password) throws UsernameAlreadyExistsException {
        String encodedPass = encodePassword(username,password);
        for (User user : users) {
           if (username.equals(user.getUsername()) && encodedPass.equals(user.getPassword()))
                return true;
            //throw new UsernameAlreadyExistsException(username);
       }
        return false;
    }

    public static String checkOwnerOrClient(String username,String password){

        String encodedPass = encodePassword(username,password);
        for(User user : users){
            if (username.equals(user.getUsername()) && encodedPass.equals(user.getPassword())){
                return user.getRole();

            }

        }

        return "not";

    }



    private static void persistUsers() {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(USERS_PATH.toFile(), users);

        } catch (IOException e) {
            throw new CouldNotWriteUsersException();
        }
    }

    public static String encodePassword(String salt, String password) {
        MessageDigest md = getMessageDigest();
        md.update(salt.getBytes(StandardCharsets.UTF_8));

        byte[] hashedPassword = md.digest(password.getBytes(StandardCharsets.UTF_8));


        return new String(hashedPassword, StandardCharsets.UTF_8)
                .replace("\"", "");
    }

    private static MessageDigest getMessageDigest() {
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("SHA-512");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("SHA-512 does not exist!");
        }
        return md;
    }


    public static List<User> getUsers() {
        return users;
    }


}
