package com.example.MakersAirBnb.MakersAirBnb.Login;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Login {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private Long userId;

    public Login(Long userId){

        this.userId = userId;

    }

    @Override
    public String toString() {
        return String.format(
                "Login[id=%d, userId='%s']",
                id, userId);
    }

    public Long getUserId() {
        return userId;
    }

}
