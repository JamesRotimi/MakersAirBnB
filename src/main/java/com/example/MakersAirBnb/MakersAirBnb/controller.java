package com.example.MakersAirBnb.MakersAirBnb;

import org.apache.logging.log4j.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

public class controller {

    @Controller
    @RequestMapping("/")
    public class MessageController {

        int number = 1;

        @Autowired
        private MessageRepository messageRepository;

        @GetMapping
        public ModelAndView index() {
            Iterable<Message> messages = messageRepository.findAll();
            return new ModelAndView("index", "index", messages);
        }

    }


}
