package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShopping() {
        //Given
        TasksFactory tasksFactory = new TasksFactory();
        //When
        Tasks shopping = tasksFactory.makeTask(TasksFactory.SHOPPING);
        //Then
        System.out.println(shopping.executeTask());
        Assert.assertTrue(shopping.isTaskExecuted());
        Assert.assertEquals("Shopping to Do", shopping.getTaskName());

    }

    @Test
    public void testFactoryPainting() {
        //Given
        TasksFactory factory = new TasksFactory();
        //When
        Tasks painting = factory.makeTask(TasksFactory.PAINTING);
        //Then
        System.out.println(painting.executeTask());
        Assert.assertEquals("Wall to paint", painting.getTaskName());
        Assert.assertTrue(painting.isTaskExecuted());

    }

    @Test
    public void tetFactryDriving() {
        //Given
        TasksFactory factory = new TasksFactory();
        //When
        Tasks driving = factory.makeTask(TasksFactory.DRIVING);
        //Then
        System.out.println(driving.executeTask());
        Assert.assertTrue(driving.isTaskExecuted());
        Assert.assertEquals("Get kids to school", driving.getTaskName());
    }
}
