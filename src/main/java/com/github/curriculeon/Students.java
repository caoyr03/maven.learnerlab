package com.github.curriculeon;
import java.util.*;

public final class Students extends People<Student>{
    private static final Students instance = new Students();
    private Students(){
        super(); //inherit super class from people
        this.add(new Student(0L,"Julia")); //invoke on People methods
        this.add(new Student(1L,"David Y"));
    }

    @Override
    public Student[] toArray() {
        Student[] newArray = new Student[count()];
        List<Student> sourceList = this.personList; //access the personList fields from superclass People
        return sourceList.toArray(newArray);
    }

    public static Students getInstance(){
        return instance;
    }

}
