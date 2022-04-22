package com.challenge.users;

import com.challenge.users.adapter.MessageAdapter;
import com.challenge.users.dto.MessageDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wpp-group/send")
public class UserController {

    private final MessageAdapter messageAdapter;

    public UserController(MessageAdapter messageAdapter) {
        this.messageAdapter = messageAdapter;
    }

    @PostMapping
    public void send(@RequestBody MessageDTO msj) {
        this.messageAdapter.toDomain(msj);
    }
}
