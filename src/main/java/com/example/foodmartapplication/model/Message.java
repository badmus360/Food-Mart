package com.example.foodmartapplication.model;

import java.util.Date;

@Entity
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long messageId;
    private String message;
    private Date createdAt;
    private Date modifiedAt;
}

