package com.challenge.users.model;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "message")
public class Message {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "content")
    private String content;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "date")
    private LocalDateTime date;

    public Message(){}

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
