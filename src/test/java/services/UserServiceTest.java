package services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import exceptions.UsernameAlreadyExistsException;
import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import usermodel.User;

import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

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
        UserService.loadUsersFromFile();
        assertTrue(Files.exists(UserService.USERS_PATH));
    }


    @Test
    void loadUsersFromFile() throws IOException {
        UserService.loadUsersFromFile();
        assertTrue(Files.exists(UserService.USERS_PATH));

    }

    @Test
    void addUser() throws IOException, UsernameAlreadyExistsException {

        int aux = UserService.getUsers().size();
        UserService.loadUsersFromFile();
        UserService.addUser("test211", "testPass","ASd" ,"Sad","Sdas","Asd","ASD");
        assertNotNull(UserService.users);
        assertEquals(aux + 1, UserService.getUsers().size());
    }

    @Test
    public void testAddOneUserIsPersisted() throws Exception {
        int aux = UserService.getUsers().size();
        UserService.loadUsersFromFile();
        UserService.addUser("test21324341", "testPass","ASd" ,"Sad","Sdas","Asd","ASD");
        List<User> users = new ObjectMapper().readValue(UserService.USERS_PATH.toFile(), new TypeReference<List<User>>() {
        });
        assertNotNull(users);
        assertEquals(aux + 1, users.size());
    }

    @Test
    public void testPasswordEncoding() {
        assertNotEquals("testPass12", UserService.encodePassword("username1", "testPass1"));
    }





}