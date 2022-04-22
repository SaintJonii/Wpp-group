package com.challenge.users.services;

import com.challenge.repository.MessageRepository;
import com.challenge.users.model.Message;
import com.challenge.users.model.User;
import com.challenge.users.validators.UserNumberValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final static Logger logger = LoggerFactory.getLogger(UserService.class);
    private final List<User> users;
    private final MessageRepository messageRepository;

    public UserService(MessageRepository messageRepository) {
        this.users = new ArrayList<>();
        this.messageRepository = messageRepository;
    }

    public void addUser(String phoneNumber) {
        UserNumberValidator.validate(phoneNumber);
        User user = new User(phoneNumber);
        users.add(user);
    }

    public void removeUser(String phoneNumber) {
        UserNumberValidator.validate(phoneNumber);
        Optional<User> user = users.stream().filter(item -> item.getNumber().equals(phoneNumber)).findFirst();
        if(user.isPresent()){
            users.remove(user);
        }
        else{
            logger.info(String.format("User not found"));
        }
    }

    public void sendMessage(Message message){
        logger.info(String.format("Message received: %s", message));
        message = this.messageRepository.save(message);
        this.notifyUser(message.getContent());
    }

    private void notifyUser(String newMsg){
        for(User user : users){
            user.notify(newMsg);
        }
    }

    public User findUser(String phoneNumber){
        return null;
    }

}
