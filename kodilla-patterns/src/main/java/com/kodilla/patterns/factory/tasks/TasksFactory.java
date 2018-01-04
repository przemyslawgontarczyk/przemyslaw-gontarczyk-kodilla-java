package com.kodilla.patterns.factory.tasks;

public final class TasksFactory {
    public static final String SHOPPING = "SHOPPING TASK";
    public static final String PAINTING = "PAINTING TASK";
    public static final String DRIVING = "DRIVING TASK";

    public final Tasks makeTask(String className) {
        switch (className) {
            case SHOPPING:
                return new ShoppingTask("Shopping to Do", "Apples", 12);
            case PAINTING:
                return new PaintingTask("Wall to paint", "Blue", "Wall");
            case DRIVING:
                return new DrivingTask("Get kids to school", "School", "Car");
            default:
                return null;
        }
    }
}
