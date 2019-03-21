package com.example.MakersAirBnb.MakersAirBnb.spaces;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Space {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String title;
    private String location;
    private String description;

    protected Space() {}

    public Space(String title, String location, String description) {
        this.title = title;
        this.location = location;
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format(
                "Space[id=%d, title='%s', location='%s', description='%s']",
                id, title, location, description);
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}

