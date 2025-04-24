package com.example.EmailAi.models;

import lombok.Data;

@Data
public class EmailRequest {
    private String emailContent;
    private String tone;
}
