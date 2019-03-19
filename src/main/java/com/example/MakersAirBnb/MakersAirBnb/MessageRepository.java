package com.example.MakersAirBnb.MakersAirBnb;

import org.apache.logging.log4j.message.Message;

import java.util.Iterator;

public class MessageRepository {
    public Iterable<Message> findAll() {
        return new Iterable<Message>() {
            @Override
            public Iterator<Message> iterator() {
                return null;
            }
        };
    }
}
