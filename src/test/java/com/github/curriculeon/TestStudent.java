package com.github.curriculeon;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestStudent {
    long id = 611851475143L;
    String name = "Yuru Cao";
    Student myStudent = new Student(id,name);

    @Test
    public void testImplementation(){
        assertTrue(myStudent instanceof Learner);
    }

    @Test
    public void testInheritance(){
        assertTrue(myStudent instanceof Person);
    }

    @Test
    public void testLearn(){
        myStudent.learn(2);
        assertEquals(Double.valueOf(2),myStudent.getTotalStudyTime());
        myStudent.learn(4);
        assertEquals(Double.valueOf(6),myStudent.getTotalStudyTime());
    }

}
