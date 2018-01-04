package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Tasks {

    final String taskName;
    final String color;
    final String whatToPaint;
    private PaintingTask paintingTask;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    protected Boolean x;

    @Override
    public Boolean executeTask() {
        System.out.println("Now painting: " + whatToPaint + " in " + color + " color");
        x = true;
        return x;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public Boolean isTaskExecuted() {
        if (x = true) {
            System.out.println("Task is done");
        } else {
            System.out.println("Task is not done");
        }
        return x;
    }
}
