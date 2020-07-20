package com.github.curriculeon;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestInstructor {
    long id = 600851475143L;
    String name = "Leon Hunter";
    long idOfStu1 = 611851475143L;
    String nameOfStu1 = "Yuru Cao";
    long idOfStu2 = 622851475143L;
    String nameOfStu2 = "Jose Cruz";
    long idOfStu3 = 633851475143L;
    String nameOfStu3 = "Steven Snyder";
    Instructor myInstructor = new Instructor(id,name);
    Student myLearner1 = new Student(idOfStu1,nameOfStu1);
    Student myLearner2 = new Student(idOfStu2,nameOfStu2);
    Student myLearner3 = new Student(idOfStu3, nameOfStu3);

    @Test
    public void testImplementation(){
        assertTrue(myInstructor instanceof Instructor);
    }

    @Test
    public void testInheritance(){
        assertTrue(myInstructor instanceof Person);
    }

    @Test
    public void testTeach(){
        myInstructor.teach(myLearner1,2);
        assertEquals(Double.valueOf(2),myLearner1.getTotalStudyTime());
        myInstructor.teach(myLearner1,4);
        assertEquals(Double.valueOf(6),myLearner1.getTotalStudyTime());
    }

    @Test
    public void testLecture(){
        Learner[] myStudents = new Learner[]{myLearner1,myLearner2,myLearner3};
        myInstructor.lecture(myStudents,9);
        assertEquals(Double.valueOf(3),myLearner1.getTotalStudyTime());
        assertEquals(Double.valueOf(3),myLearner2.getTotalStudyTime());
        assertEquals(Double.valueOf(3),myLearner3.getTotalStudyTime());
        myInstructor.lecture(myStudents,12);
        assertEquals(Double.valueOf(7),myLearner1.getTotalStudyTime());
        assertEquals(Double.valueOf(7),myLearner2.getTotalStudyTime());
        assertEquals(Double.valueOf(7),myLearner3.getTotalStudyTime());
    }
}
