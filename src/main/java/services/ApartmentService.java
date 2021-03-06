package services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;
import exceptions.CouldNotWriteUsersException;
import exceptions.EmptyFieldsException;
import exceptions.UsernameAlreadyExistsException;
import usermodel.Apartment;
import usermodel.User;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Objects;

public class ApartmentService {

    public static List <Apartment> apartments;
    private static final Path APARTMENT_PATH = FileSystemService.getPathToFile("config", "apartments.json");

    public static void loadAFromFile() throws IOException{

        if(!Files.exists(APARTMENT_PATH)){
            FileUtils.copyURLToFile(UserService.class.getClassLoader().getResource("apartments.json"),APARTMENT_PATH.toFile());
        }

        ObjectMapper objectMapper = new ObjectMapper();

        apartments = objectMapper.readValue(APARTMENT_PATH.toFile(), new TypeReference<List<Apartment>>() {

        });
    }

    public static void addApartment(String address,String price,String utilities,String nrofrooms,String owner,String description){

        apartments.add(new Apartment(nrofrooms,utilities,address,price,description,owner));
        persistApartments();

    }






    public static void persistApartments() {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(APARTMENT_PATH.toFile(), apartments);

        } catch (IOException e) {
            throw new CouldNotWriteUsersException();
        }
    }





}
