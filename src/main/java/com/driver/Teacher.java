package com.driver;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Teacher {

    private String name;

    private int numberOfStudents;

    private int age;

    public Teacher() {

    }
}