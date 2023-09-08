package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class tnmblr {
    

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer i;

    private String userMail; 
    private String recvmail;

}
