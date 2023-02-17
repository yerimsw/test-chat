package com.example.demo.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class MessageModel {
    private String message;
    private String sender;
    private String to;
}
