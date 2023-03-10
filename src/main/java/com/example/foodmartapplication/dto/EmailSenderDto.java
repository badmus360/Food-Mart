package com.example.foodmartapplication.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class EmailSenderDto {

    private String to;

    private String subject;

    private String content;
}
