package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass
    public static void log(){
        Logger.getInstance().log("Some log");
    }
    @Test
    public void testgetLastLog(){

        //Given
        //When
        String log = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("Some log", log);
    }

}
