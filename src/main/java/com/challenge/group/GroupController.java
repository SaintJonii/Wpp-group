package com.challenge.group;

import com.challenge.users.services.UserService;
import org.springframework.web.bind.annotation.*;

@RestController("/wpp-group")
public class GroupController {

    private final UserService userService;

    public GroupController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping()
    public void addUser(@RequestBody String phoneNumber) {
        userService.addUser(phoneNumber);
    }

    @DeleteMapping()
    public void removeUser(@PathVariable("id") String phoneNumber) {
        userService.removeUser(phoneNumber);
    }

}
