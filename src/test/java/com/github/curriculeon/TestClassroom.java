package com.github.curriculeon;

import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

public class TestClassroom {
    @Test
    public void testHoseLecture(){
        //given
        Classroom classroom = Classroom.INSTANCE;
        Teacher teacher = Instructors.getInstance().findById(0L);
        Integer numberOfStudents = Students.getInstance().count();
        Double numberOfHoursToLecture = numberOfStudents.doubleValue();
        Double expectedNumberOfHoursLearned = numberOfHoursToLecture / numberOfStudents;
        Map<Student, Double> preStudy = classroom.getStudyMap();

        //when
        classroom.hostLecture(teacher, numberOfHoursToLecture);
        Map<Student, Double> postStudMap = classroom.getStudyMap();
        Set<Student> keySet = postStudMap.keySet();
        for(Student student: keySet) {
            Double preStudyTime = preStudy.get(student);
            Double expectedStudyTime = preStudyTime + expectedNumberOfHoursLearned;
            Double actualStudyTime = postStudMap.get(student);

            //then
            assertEquals(expectedStudyTime,actualStudyTime);
        }
     }
}
