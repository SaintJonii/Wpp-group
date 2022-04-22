package com.challenge.users.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class User implements Subscriber{
    private String phoneNumber;
    private static Logger logger = LoggerFactory.getLogger(User.class);

    public User(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void notify(String msg) {
        logger.info(String.format("New message: %s", msg));
    }

    public String getNumber() {
        return phoneNumber;
    }
}
