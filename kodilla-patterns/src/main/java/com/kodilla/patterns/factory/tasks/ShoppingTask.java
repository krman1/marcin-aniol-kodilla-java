package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements Task{

    final String taskName;
    final String whatToBuy;
    final double quantity;
    private boolean taskDone = false;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;


    }
    @Override
    public void executeTask(){
        System.out.println("Zadanie " + getTaskName() +  " wykonane");
        taskDone = true;

    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted(){
    if (taskDone){
        return true;
    }
    else
        return false;
    }
}
