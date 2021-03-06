package services;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;


import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;


public class ApartmentServiceTest {
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
    public void loadAFromFile() throws IOException{
        ApartmentService.loadAFromFile();
        assertTrue(Files.exists(UserService.USERS_PATH));
    }
    @Test
    public void addApartment()  throws IOException {
        ApartmentService.loadAFromFile();

        ApartmentService.addApartment("test211", "testPass","ASd" ,"Sad","Sdas","Asd");

        assertNotNull(ApartmentService.apartments);


        //assertEquals( 1, OffersService.getOffers().size());
    }


}