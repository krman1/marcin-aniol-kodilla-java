package com.kodilla.patterns2.observer.homework;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TasksQueueTestSuite {
	
	
	@Test
	public void testUpdate() {
		//Given
		ImportantTask importantTask = new ImportantTask();
		VeryImportantTask veryImportantTask = new VeryImportantTask();
		Mentor zn = new Mentor("Zbyszek Nowak");
		Mentor jk = new Mentor("Jan kowalski");
		veryImportantTask.registerObserver(zn);
		importantTask.registerObserver(zn);
		veryImportantTask.registerObserver(jk);
		
		//When
		veryImportantTask.addTask("task1");
		veryImportantTask.addTask("task2");
		importantTask.addTask("task3");
		
		
		//Then
		assertEquals(3,zn.getUpdateCount());
		assertEquals(2,jk.getUpdateCount());
	}
}
