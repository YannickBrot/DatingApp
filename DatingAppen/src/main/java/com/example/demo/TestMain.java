package com.example.demo;


import Objects.User;

import java.time.LocalDate;

public class TestMain {

    public static void main(String[] args){
        User bob = new User(12,"Bob","Hanseen", LocalDate.of(1993, 12,12), "bob@Hansen.dk",22222222, "Description","photo","bob","male","gay" );
        System.out.println(bob.calculateAge());
    }
}
