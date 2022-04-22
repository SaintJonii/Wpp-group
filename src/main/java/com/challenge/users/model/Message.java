package com.challenge.users.model;
import java.time.LocalDateTime;

public class Message {
    private Long id;
    private String content;
    private String phoneNumber;
    private LocalDateTime date;

    public Message(String content, String phoneNumber, LocalDateTime date) {
        this.content = content;
        this.phoneNumber = phoneNumber;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public LocalDateTime getDate() {
        return date;
    }
}
