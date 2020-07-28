package com.github.curriculeon;

import java.util.*;

public enum Classroom { //create a classroom singleton -> which is a enum, a set of constant values
    INSTANCE;
    private Students students = Students.getInstance();
    private Instructors instructors = Instructors.getInstance();


    public void hostLecture(Teacher teacher, Double numberOfHours) {
        teacher.lecture(students.toArray(),numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours) {
        Instructor instructor = instructors.findById(id);
        instructor.lecture(students.toArray(),numberOfHours);
    }

    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> result = new HashMap<>();
        for(Student student : students.toArray()) {
            Double studyTime = student.getTotalStudyTime();
            result.put(student, studyTime);
        }
        return result;
    }

}
