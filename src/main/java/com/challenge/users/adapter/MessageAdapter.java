package com.challenge.users.adapter;

import com.challenge.users.dto.MessageDTO;
import com.challenge.users.model.Message;
import com.challenge.users.services.UserService;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
public class MessageAdapter {

    private final UserService userService;

    public MessageAdapter(UserService userService) {
        this.userService = userService;
    }

    public void toDomain(MessageDTO message){
        var messageToSend = new Message(message.getMessage(), message.getPhoneNumber(), LocalDateTime.now());
        userService.sendMessage(messageToSend);
    }

}
