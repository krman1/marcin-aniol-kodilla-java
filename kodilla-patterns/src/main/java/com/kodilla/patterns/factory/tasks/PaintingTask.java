package com.kodilla.patterns.factory.tasks;

public final class PaintingTask implements Task{

    final String taskName;
    final String color;
    final String whatToPaint;
    private boolean taskDone = false;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
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
