package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {

    @Test
    public void testCalculateAdvStatistics0posts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> usersNames = new ArrayList();
        usersNames.add("Jan Kowalski");
        usersNames.add("Jan Kowalski1");
        usersNames.add("Jan Kowalski2");
        usersNames.add("Jan Kowalski3");
        usersNames.add("Jan Kowalski4");

        when(statisticsMock.usersNames()).thenReturn( usersNames);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(10);

        ForumStatistic forumStatistic = new ForumStatistic();

        //When
        forumStatistic.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0,forumStatistic.getNumberPostsPerUser(),0.001);
        assertEquals(2,forumStatistic.getNumberCommentsPerUser(), 0.001);
        assertEquals(0,forumStatistic.getNumberCommentsPerPosts(),0.001);
    }
    @Test
    public void testCalculateAdvStatistics1000posts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> usersNames = new ArrayList();
        usersNames.add("Jan Kowalski");
        usersNames.add("Jan Kowalski1");
        usersNames.add("Jan Kowalski2");
        usersNames.add("Jan Kowalski3");
        usersNames.add("Jan Kowalski4");

        when(statisticsMock.usersNames()).thenReturn( usersNames);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        ForumStatistic forumStatistic = new ForumStatistic();

        //When
        forumStatistic.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(200,forumStatistic.getNumberPostsPerUser(),0.001);
        assertEquals(200,forumStatistic.getNumberCommentsPerUser(), 0.001);
        assertEquals(1,forumStatistic.getNumberCommentsPerPosts(),0.001);
    }
    @Test
    public void testCalculateAdvStatistics0comments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> usersNames = new ArrayList();
        usersNames.add("Jan Kowalski");
        usersNames.add("Jan Kowalski1");
        usersNames.add("Jan Kowalski2");
        usersNames.add("Jan Kowalski3");
        usersNames.add("Jan Kowalski4");

        when(statisticsMock.usersNames()).thenReturn( usersNames);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(0);

        ForumStatistic forumStatistic = new ForumStatistic();

        //When
        forumStatistic.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(2,forumStatistic.getNumberPostsPerUser(),0.001);
        assertEquals(0,forumStatistic.getNumberCommentsPerUser(), 0.001);
        assertEquals(0,forumStatistic.getNumberCommentsPerPosts(),0.001);
    }
    @Test
    public void testCalculateAdvStatisticsMoreComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> usersNames = new ArrayList();
        usersNames.add("Jan Kowalski");
        usersNames.add("Jan Kowalski1");
        usersNames.add("Jan Kowalski2");
        usersNames.add("Jan Kowalski3");
        usersNames.add("Jan Kowalski4");

        when(statisticsMock.usersNames()).thenReturn( usersNames);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(20);

        ForumStatistic forumStatistic = new ForumStatistic();

        //When
        forumStatistic.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(2,forumStatistic.getNumberPostsPerUser(),0.001);
        assertEquals(4,forumStatistic.getNumberCommentsPerUser(), 0.001);
        assertEquals(2,forumStatistic.getNumberCommentsPerPosts(),0.001);
    }
    @Test
    public void testCalculateAdvStatisticsMorePosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> usersNames = new ArrayList();
        usersNames.add("Jan Kowalski");
        usersNames.add("Jan Kowalski1");
        usersNames.add("Jan Kowalski2");
        usersNames.add("Jan Kowalski3");
        usersNames.add("Jan Kowalski4");

        when(statisticsMock.usersNames()).thenReturn( usersNames);
        when(statisticsMock.postsCount()).thenReturn(20);
        when(statisticsMock.commentsCount()).thenReturn(10);

        ForumStatistic forumStatistic = new ForumStatistic();

        //When
        forumStatistic.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(4,forumStatistic.getNumberPostsPerUser(),0.001);
        assertEquals(2,forumStatistic.getNumberCommentsPerUser(), 0.001);
        assertEquals(0,forumStatistic.getNumberCommentsPerPosts(),0.001);
    }
    @Test
    public void testCalculateAdvStatistics0Users() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> usersNames = new ArrayList();

        when(statisticsMock.usersNames()).thenReturn( usersNames);
        when(statisticsMock.postsCount()).thenReturn(20);
        when(statisticsMock.commentsCount()).thenReturn(40);

        ForumStatistic forumStatistic = new ForumStatistic();

        //When
        forumStatistic.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0,forumStatistic.getNumberPostsPerUser(),0.001);
        assertEquals(0,forumStatistic.getNumberCommentsPerUser(), 0.001);
        assertEquals(2,forumStatistic.getNumberCommentsPerPosts(),0.001);
    }
    @Test
    public void testCalculateAdvStatistics100Users() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> usersNames = new ArrayList();
        for(int i =  1; i <= 100; i++) {
            usersNames.add("Jan Kowalski" + i);
        }

        when(statisticsMock.usersNames()).thenReturn( usersNames);
        when(statisticsMock.postsCount()).thenReturn(200);
        when(statisticsMock.commentsCount()).thenReturn(400);

        ForumStatistic forumStatistic = new ForumStatistic();

        //When
        forumStatistic.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(2,forumStatistic.getNumberPostsPerUser(),0.001);
        assertEquals(4,forumStatistic.getNumberCommentsPerUser(), 0.001);
        assertEquals(2,forumStatistic.getNumberCommentsPerPosts(),0.001);
    }
}
