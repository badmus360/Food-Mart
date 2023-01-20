package com.example.foodmartapplication.model;

import java.util.Date;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String addressName;
    private String phoneNumber;
    private String fullName;
    private String deliveryEmail;
    private Boolean isDefaultAddress;
    private Date createdAt;
    private Date modifiedAt;

}