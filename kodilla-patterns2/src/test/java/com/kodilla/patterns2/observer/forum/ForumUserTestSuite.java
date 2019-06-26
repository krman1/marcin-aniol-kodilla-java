package com.kodilla.patterns2.observer.forum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ForumUserTestSuite {
	
	@Test
	public void testUpdate() {
		
		//Given
		ForumTopic javaHelperForum = new JavaHelperForumTopic();
		ForumTopic javaToolsForum = new JavaToolsForumTopic();
		ForumUser johnSmith = new ForumUser("John Smith");
		ForumUser ivoneEscobar = new ForumUser("Ivone Escobar");
		ForumUser jessiePinkman = new ForumUser("Jessie Pinkman");
		javaHelperForum.registerObserver(johnSmith);
		javaToolsForum.registerObserver(ivoneEscobar);
		javaHelperForum.registerObserver(jessiePinkman);
		javaToolsForum.registerObserver(jessiePinkman);
		//When
		javaHelperForum.addPost("Hi everyone could you help me with for loop?");
        javaHelperForum.addPost("Better try while loop ");
        javaToolsForum.addPost("Help please, my SQL db doesn't want to work :(");
		javaHelperForum.addPost("Why while is better?");
        javaToolsForum.addPost("When I try to log in I got bad credentials message");
	//Then
	assertEquals(3, johnSmith.getUpdateCount());
	assertEquals(2, ivoneEscobar.getUpdateCount());
	assertEquals(5, jessiePinkman.getUpdateCount());
}
}
