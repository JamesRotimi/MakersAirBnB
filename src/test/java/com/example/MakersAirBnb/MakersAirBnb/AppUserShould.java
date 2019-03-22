package com.example.MakersAirBnb.MakersAirBnb;

import com.example.MakersAirBnb.MakersAirBnb.appUser.AppUser;
import com.example.MakersAirBnb.MakersAirBnb.spaces.Space;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppUserShould {

    private AppUser appUser;

    @Test
    public void getFirstName() {
        appUser = new AppUser("Test name", "Test lastname", "test@gmail.com", "test password");
        assertEquals(appUser.getFirstName(), "Test name");
    }


    @Test
    public void getLastName() {
        appUser = new AppUser("Test name", "Test lastname", "test@gmail.com", "test password");
        assertEquals(appUser.getLastName(), "Test lastname");
    }


    @Test
    public void getEmailAddress() {
        appUser = new AppUser("Test name", "Test lastname", "test@gmail.com", "test password");
        assertEquals(appUser.getEmailAddress(), "test@gmail.com");
    }


    @Test
    public void getPassword() {
        appUser = new AppUser("Test name", "Test lastname", "test@gmail.com", "test password");
        assertEquals(appUser.getPassword(), "test password");
    }
    
}