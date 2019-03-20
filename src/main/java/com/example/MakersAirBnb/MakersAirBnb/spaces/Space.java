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
    private String text;

    protected Space() {}

    public Space(String text) {
        this.text = text;

    }

    @Override
    public String toString() {
        return String.format(
                "Space[id=%d, text='%s']",
                id, text);
    }


    //getter for id
    public Long getId() {
        return id;
    }

    //getter for text
    public String getText() {
        return text;
    }

    //setter for text
    public void setText(String text) {
        this.text = text;
    }
}

