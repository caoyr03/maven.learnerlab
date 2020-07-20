package com.github.curriculeon;

public class Instructor extends Person implements Teacher{

    public Instructor(long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        for(Learner learner: learners){
            learner.learn(numberOfHours / learners.length);
        }
    }
}
