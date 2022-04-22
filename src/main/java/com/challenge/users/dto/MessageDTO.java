package com.challenge.users.dto;

public class MessageDTO {
    private final String message;
    private final String phoneNumber;


    public MessageDTO(String message, String phoneNumber) {
        this.message = message;
        this.phoneNumber = phoneNumber;
    }

    public String getMessage() {
        return message;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

}
