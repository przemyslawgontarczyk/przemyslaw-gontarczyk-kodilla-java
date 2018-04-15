package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {

    private int homeworksCount;

    public void update(AdeptHomeworks adeptHomeworks) {
        System.out.println("New homework from adepts: " + adeptHomeworks.getStudentName() +
                ". Homework link: " + adeptHomeworks.getHomeworksLinks().peekLast());
        homeworksCount++;
    }

    public int getHomeworksCount() {
        return homeworksCount;
    }
}