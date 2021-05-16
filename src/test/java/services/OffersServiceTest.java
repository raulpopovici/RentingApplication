package services;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

public class OffersServiceTest {


    @BeforeAll
    public static void setupClass() throws IOException {

        FileSystemService.APPLICATION_FOLDER = ".test-renting-app";
        FileSystemService.initApplicationHomeDirIfNeeded();

    }

    @BeforeEach
    public void setUp() throws IOException {
        FileUtils.cleanDirectory(FileSystemService.getApplicationHomePath().toFile());
    }

    @Test
    public void testCopyDefaultFileIfNotExists() throws Exception {
        OffersService.loadOffersFromFile();
        assertTrue(Files.exists(UserService.USERS_PATH));
    }


    @Test
    public void loadOffersFromFile() throws IOException {

        OffersService.loadOffersFromFile();
        assertTrue(Files.exists(UserService.USERS_PATH));


    }

    @Test
    public void addOffer() throws IOException {
      //  int aux = OffersService.getOffers().size();

        OffersService.loadOffersFromFile();

        OffersService.addOffer("test211", "testPass","ASd" ,"Sad","Sdas","Asd","ASD","ASd","DS","DAs");

        assertNotNull(OffersService.offers);


        assertEquals( 1, OffersService.getOffers().size());


    }
}