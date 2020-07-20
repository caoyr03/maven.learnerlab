package com.github.curriculeon;

import org.junit.Test;
import static org.junit.Assert.*;


public class TestPerson {
    long id = 600851475143L;
    String name = "Leon Hunter";

    @Test
    public void testConstructor(){
        Person myPerson = new Person(id, name);
        assertEquals(id, myPerson.getId());
        assertEquals(name, myPerson.getName());
    }

    @Test
    public void testSetName(){
        Person myPerson = new Person(id, name);
        myPerson.setName("New Name");
        assertEquals("New Name",myPerson.getName());
    }
}
