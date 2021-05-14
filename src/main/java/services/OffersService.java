package services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;
import exceptions.CouldNotWriteUsersException;
import exceptions.EmptyFieldsException;
import exceptions.UsernameAlreadyExistsException;
import usermodel.Apartment;
import usermodel.Offer;
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

public class OffersService {

    public static List <Offer> offers;
    private static final Path OFFER_PATH = FileSystemService.getPathToFile("config", "offers.json");

   public static void loadOffersFromFile()  throws IOException{

       if (!Files.exists(OFFER_PATH)) {
           FileUtils.copyURLToFile(UserService.class.getClassLoader().getResource("offers.json"), OFFER_PATH.toFile());
       }

       ObjectMapper objectMapper = new ObjectMapper();

       offers = objectMapper.readValue(OFFER_PATH.toFile(), new TypeReference<List<Offer>>() {
       });


    }


    public static void addOffer(String nrrooms,String utilities,String address,String price, String description ,String ownername, String clientFirstName,String clientLastName,String clientPhoneNumber,String Date){

        offers.add(new Offer(nrrooms,utilities,address,price,description ,ownername,clientFirstName,clientLastName,clientPhoneNumber,Date));
        persistUsers();

    }

    private static void persistUsers() {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(OFFER_PATH.toFile(), offers);

        } catch (IOException e) {
            throw new CouldNotWriteUsersException();
        }
    }


    public static List<Offer> getOffers() {
        return offers;
    }





}