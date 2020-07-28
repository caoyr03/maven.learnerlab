package com.github.curriculeon;

import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

public class testInstructors {
    @Test
    public void test() {
        Instructors instructors = Instructors.getInstance();
        List<String> expectedNames = Arrays.asList("Leon","Haseeb");
        for(Instructor instructor: instructors) {
            assertTrue(expectedNames.contains(instructor.getName()));
        }
    }

}
