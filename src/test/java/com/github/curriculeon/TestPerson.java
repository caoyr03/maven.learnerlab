package com.github.curriculeon;

import org.junit.Test;
import static org.junit.Assert.*;


public class TestPerson {


    @Test
    public void testConstructor(){
        //given
        Long expectedId = 600851475143L;
        String expectedName = "Leon Hunter";

        //when
        Person myPerson = new Person(expectedId, expectedName);
        Long actualId = myPerson.getId();
        String actualName = myPerson.getName();

        //then
        assertEquals(expectedId, actualId);
        assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName(){
        //given
        Long expectedId = 600851475143L;
        String expectedName = "Leon Hunter";

        //when
        Person myPerson = new Person(expectedId, expectedName);
        myPerson.setName("New Name");

        //then
        assertEquals("New Name",myPerson.getName());
    }
}
