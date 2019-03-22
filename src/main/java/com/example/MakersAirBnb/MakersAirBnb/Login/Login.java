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
    private String sessionId;

    public Login(Long userId, String sessionId){

        this.userId = userId;
        this.sessionId = sessionId;

    }

    @Override
    public String toString() {
        return String.format(
                "Login[id=%d, userId='%s', sessionId='%s']",
                id, userId, sessionId);
    }

    public Long getUserId() {
        return userId;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
}
