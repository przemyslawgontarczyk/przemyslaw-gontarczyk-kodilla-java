package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAdd() {

        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        String firstToDo = "first td task";
        String firstInProgress = "first ip task";
        String firstDone = "first d task";
        board.getToDoList().getTasks().add(firstToDo);
        board.getInProgressList().getTasks().add(firstInProgress);
        board.getDoneList().getTasks().add(firstDone);

        //Then
        String test1 = board.getToDoList().getTasks().get(0);
        System.out.println("First task in ToDo List is: " + test1);
        Assert.assertEquals(test1, "first td task");

        String test2 = board.getInProgressList().getTasks().get(0);
        System.out.println("First task in InProgress List is: " + test2);
        Assert.assertEquals(test2, "first ip task");

        String test3 = board.getDoneList().getTasks().get(0);
        System.out.println("First task in Done List is: " + test3);
        Assert.assertEquals(test3, "first d task");


    }
}
