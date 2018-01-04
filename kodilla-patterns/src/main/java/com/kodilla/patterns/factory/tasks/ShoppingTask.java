package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Tasks {
    final String taskName;
    final String whatToBuy;
    final double quantity;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    protected Boolean x;

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public Boolean executeTask() {
        System.out.println("Buying :" + whatToBuy + " ,quantity: " + quantity);
        x = true;
        return x;
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
