package com.github.curriculeon;
import java.util.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestPeople {
    People myPeople = Instructors.getInstance();
    Person person1 = new Person(123,"Leon Hunter");
    Person person2 = new Person(456,"Yuru Cao");

    @Test
    public void testAdd(){
        myPeople.add(person1);
        myPeople.add(person2);
        assertTrue(myPeople.contains(person1));
        assertTrue(myPeople.contains(person2));
        assertEquals(myPeople.count(),2);
        Iterator<Person> iter = myPeople.iterator();
        assertEquals(iter.next(),person1);
        assertEquals(iter.next(),person2);
    }

    @Test
    public void testRemove(){
        myPeople.add(person1);
        myPeople.add(person2);
        myPeople.remove(person1);
        assertFalse(myPeople.contains(person1));
        assertEquals(myPeople.count(),1);
        myPeople.removeAll();
        assertEquals(myPeople.count(),0);
    }

    @Test
    public void testFindById(){
        myPeople.add(person1);
        myPeople.add(person2);
        assertEquals(person1,myPeople.findById(123));
        assertEquals(person2,myPeople.findById(456));
    }



}
