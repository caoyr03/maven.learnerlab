package com.github.curriculeon;
import java.util.*;

public class Instructors extends People<Instructor>{ //create concrete class/implementation of abstraction
    private static final Instructors instance = new Instructors();

    private Instructors(){
        super();
        this.personList.add(new Instructor(0L, "Leon"));
        this.personList.add(new Instructor(1L, "Haseeb"));
    }

    public Instructor[] toArray(){
        Instructor[] newArray = new Instructor[count()];
        List<Instructor> sourceList = this.personList; //access the field, from people subclass
        return sourceList.toArray(newArray);
    }

    public static Instructors getInstance() {
        return instance;
    }
}
