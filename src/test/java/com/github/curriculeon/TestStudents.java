package com.github.curriculeon;

import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

public class TestStudents {

    @Test
    public void test(){
        Students students = Students.getInstance();
        String[] studentNameArray = {"Julia","David Y"};
        List<String> studentNameList = Arrays.asList(studentNameArray);

        Person[] studentArray = students.toArray();
        for (int i = 0; i < studentArray.length; i++) {
            Person person = studentArray[i];
            String personName = person.getName();
            assertTrue(studentNameList.contains(personName));
        }
    }
}
