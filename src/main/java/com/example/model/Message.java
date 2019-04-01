package com.example.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Message implements Serializable {

    private String name;
    private String description;

}
