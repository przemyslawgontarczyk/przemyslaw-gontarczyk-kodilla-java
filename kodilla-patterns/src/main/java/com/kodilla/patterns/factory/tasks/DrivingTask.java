package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Tasks {
    final String taskName;
    final String where;
    final String using;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    protected Boolean x;

    @Override
    public Boolean executeTask() {
        System.out.println("I'm moving to: " + where + " ,using: " + using);
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
