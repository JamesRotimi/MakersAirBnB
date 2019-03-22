package com.example.MakersAirBnb.MakersAirBnb;

import com.example.MakersAirBnb.MakersAirBnb.spaces.Space;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpaceShould {

    private Space space;

    @Test
    public void getTitle() {
        space = new Space("test title", "test location", "test description");
        assertEquals(space.getTitle(), "test title");
    }

    @Test
    public void getLocation() {
        space = new Space("test title", "test location", "test description");
        assertEquals(space.getLocation(), "test location");
    }

    @Test
    public void getDescription() {
        space = new Space("test title", "test location", "test description");
        assertEquals(space.getDescription(), "test description");
    }
}
