package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        List<String> toDoList = board.getToDoList().getTasks();
        List<String> doneList = board.getDoneList().getTasks();
        List<String> inProgressList = board.getInProgressList().getTasks();
        doneList.add("Projekt - Smidowicza");
        inProgressList.add("Projekt - Dymka");
        toDoList.add("Projekt - Jar IV");
        //Then
        Assert.assertEquals("Projekt - Jar IV",toDoList.get(0));
        Assert.assertEquals("Projekt - Dymka",inProgressList.get(0));
        Assert.assertEquals("Projekt - Smidowicza",doneList.get(0));

    }
}

