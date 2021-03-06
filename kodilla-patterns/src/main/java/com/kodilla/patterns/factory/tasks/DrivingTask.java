package com.kodilla.patterns.factory.tasks;

public final class DrivingTask implements Task {

    final String taskName;
    final String where;
    final String using;
    private boolean taskDone = false;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
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
