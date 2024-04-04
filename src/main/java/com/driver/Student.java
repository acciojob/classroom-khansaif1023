package com.driver;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Student {

    private String name;
    private int age;
    private double averageScore;

    public Student(){

    }
}
