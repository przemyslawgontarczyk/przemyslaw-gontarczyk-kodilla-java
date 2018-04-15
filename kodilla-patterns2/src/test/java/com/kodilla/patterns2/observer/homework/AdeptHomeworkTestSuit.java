package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdeptHomeworkTestSuit {
    @Test
    public void shouldUpdate() {
        // Given
        int studentsCount = 5;
        int mentorsCount = 2;
        AdeptHomeworks[] studentHomeworks = new AdeptHomeworks[studentsCount];
        Mentor[] mentors = new Mentor[mentorsCount];
        mentors[0] = new Mentor();
        mentors[1] = new Mentor();
        for (int i = 0; i < studentsCount; i++) {
            studentHomeworks[i] = new AdeptHomeworks("Student " + (i + 1));
            studentHomeworks[i].registryObserver(mentors[i % mentorsCount]);
        }

        // Wnen
        for (int i = 0; i < studentsCount; i++) {
            for (int j = 0; j <= i; j++) {
                studentHomeworks[i].addHomework("Link to student's " + (i + 1) + " homework " + (j + 1));
            }
        }

        // Then
        assertEquals(9, mentors[0].getHomeworksCount());
        assertEquals(6, mentors[1].getHomeworksCount());
    }
}
