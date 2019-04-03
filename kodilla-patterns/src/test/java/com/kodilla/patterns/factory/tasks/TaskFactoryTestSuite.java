package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testShoppingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopingTask = factory.makeTask(TaskFactory.SHOPPINGTASK);
        shopingTask.executeTask();
        //Then
        Assert.assertEquals(true,shopingTask.isTaskExecuted());
    }
    @Test
    public void testPaintingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.makeTask(TaskFactory.PAINTINGTASK);
        paintingTask.executeTask();
        //Then
        Assert.assertEquals(true,paintingTask.isTaskExecuted());
    }

    @Test
    public void testDrivingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task draivingTask = factory.makeTask(TaskFactory.DRIVINGTASK);
        //draivingTask.executeTask();
        //Then
        Assert.assertEquals(false,draivingTask.isTaskExecuted());
    }
}
