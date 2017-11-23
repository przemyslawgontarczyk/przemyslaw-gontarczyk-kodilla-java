package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatsTestSuite {

    ForumStats forumStats;
    Statistics statisticsMock;
    int postsCount = 0;
    int commentsCount = 0;
    List<String> usersNames = Arrays.asList("John", "Dingo", "Sam");


    @Before
    public void before() {
        forumStats = new ForumStats();
        statisticsMock = mock(Statistics.class);

    }

    @Test
    public void testForumPosts0WithMock() {

        //Given

        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.usersNames()).thenReturn(usersNames);

        //When
        forumStats.calculateAdvStatistics(statisticsMock);
        Double newAveragePostsPerUser = forumStats.getAveragePostsPerUser();
        Double newAverageCommentsPerPost = forumStats.getAverageCommentsPerPost();
        Double newAverageCommentsPerUser = forumStats.getAverageCommentsPerUser();

        //Then
        Assert.assertEquals(new Double(0), newAveragePostsPerUser);
        Assert.assertEquals(new Double(0), newAverageCommentsPerPost);
        Assert.assertEquals(new Double(0), newAverageCommentsPerUser);

    }

    @Test
    public void testForumPosts1000WithMock() {

        //Given
        postsCount = 1000;
        commentsCount = 0;

        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.usersNames()).thenReturn(usersNames);

        //When
        forumStats.calculateAdvStatistics(statisticsMock);
        Double newAveragePostsPerUser = forumStats.getAveragePostsPerUser();
        Double newAverageCommentsPerPost = forumStats.getAverageCommentsPerPost();
        Double newAverageCommentsPerUser = forumStats.getAverageCommentsPerUser();

        //Then
        Assert.assertEquals(1000, forumStats.getPostsCount());
        Assert.assertEquals(new Double(1000 / 3.), newAveragePostsPerUser);
        Assert.assertEquals(new Double(0), newAverageCommentsPerPost);
        Assert.assertEquals(new Double(0), newAverageCommentsPerUser);
    }

    @Test
    public void testForumComments0WithMock() {

        //Given
        postsCount = 1;
        commentsCount = 0;
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.usersNames()).thenReturn(usersNames);

        //When
        forumStats.calculateAdvStatistics(statisticsMock);
        Double newAveragePostsPerUser = forumStats.getAveragePostsPerUser();
        Double newAverageCommentsPerPost = forumStats.getAverageCommentsPerPost();
        Double newAverageCommentsPerUser = forumStats.getAverageCommentsPerUser();

        //Then
        Assert.assertEquals(1, forumStats.getPostsCount());
        Assert.assertEquals(new Double(1 / 3.), newAveragePostsPerUser);
        Assert.assertEquals(new Double(0), newAverageCommentsPerPost);
        Assert.assertEquals(new Double(0), newAverageCommentsPerUser);
    }

    @Test
    public void testForumMorePostsWithMock() {

        //Given
        postsCount = 10;
        commentsCount = 5;
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.usersNames()).thenReturn(usersNames);

        //When
        forumStats.calculateAdvStatistics(statisticsMock);
        Double newAveragePostsPerUser = forumStats.getAveragePostsPerUser();
        Double newAverageCommentsPerPost = forumStats.getAverageCommentsPerPost();
        Double newAverageCommentsPerUser = forumStats.getAverageCommentsPerUser();

        //Then
        Assert.assertEquals(10, forumStats.getPostsCount());
        Assert.assertEquals(5, forumStats.getCommentsCount());
        Assert.assertEquals(new Double(10 / 3.), newAveragePostsPerUser);
        Assert.assertEquals(new Double((5 / 3.)), newAverageCommentsPerUser);
        Assert.assertEquals(new Double((5 / 10.)), newAverageCommentsPerPost);
    }

    @Test
    public void testForumMoreCommentsWithMock() {

        //Given
        postsCount = 5;
        commentsCount = 10;
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.usersNames()).thenReturn(usersNames);

        //When
        forumStats.calculateAdvStatistics(statisticsMock);
        Double newAveragePostsPerUser = forumStats.getAveragePostsPerUser();
        Double newAverageCommentsPerPost = forumStats.getAverageCommentsPerPost();
        Double newAverageCommentsPerUser = forumStats.getAverageCommentsPerUser();

        //Then
        Assert.assertEquals(5, forumStats.getPostsCount());
        Assert.assertEquals(10, forumStats.getCommentsCount());
        Assert.assertEquals(new Double(5 / 3.), newAveragePostsPerUser);
        Assert.assertEquals(new Double((10 / 3.)), newAverageCommentsPerUser);
        Assert.assertEquals(new Double((10 / 5.)), newAverageCommentsPerPost);
    }

    @Test
    public void testForumUsers0WithMock() {

        //Given

        usersNames = new ArrayList<String>(Arrays.asList());
        usersNames.removeAll(Arrays.asList(""));
        postsCount = 0;
        commentsCount = 0;
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.usersNames()).thenReturn(usersNames);

        //When
        forumStats.calculateAdvStatistics(statisticsMock);
        Double newAveragePostsPerUser = forumStats.getAveragePostsPerUser();
        Double newAverageCommentsPerPost = forumStats.getAverageCommentsPerPost();
        Double newAverageCommentsPerUser = forumStats.getAverageCommentsPerUser();

        //Then
        Assert.assertEquals(0, forumStats.getUsersCount());
        Assert.assertEquals(0, forumStats.getPostsCount());
        Assert.assertEquals(0, forumStats.getCommentsCount());
        Assert.assertEquals(new Double(0.), newAveragePostsPerUser);
        Assert.assertEquals(new Double((0.)), newAverageCommentsPerUser);
        Assert.assertEquals(new Double((0.)), newAverageCommentsPerPost);
    }

    @Test
    public void testForumUsers100WithMock() {

        //Given
        usersNames = new ArrayList<String>(Arrays.asList());
        for (int i = 0; i < 100; i++) {
            usersNames.add("User" + (i));
        }

        postsCount = 10;
        commentsCount = 0;
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.usersNames()).thenReturn(usersNames);

        //When
        forumStats.calculateAdvStatistics(statisticsMock);
        Double newAveragePostsPerUser = forumStats.getAveragePostsPerUser();
        Double newAverageCommentsPerPost = forumStats.getAverageCommentsPerPost();
        Double newAverageCommentsPerUser = forumStats.getAverageCommentsPerUser();

        //Then
        Assert.assertEquals(100, forumStats.getUsersCount());
        Assert.assertEquals(10, forumStats.getPostsCount());
        Assert.assertEquals(0, forumStats.getCommentsCount());
        Assert.assertEquals(new Double(10/100.), newAveragePostsPerUser);
        Assert.assertEquals(new Double((0.)), newAverageCommentsPerUser);
        Assert.assertEquals(new Double((0.)), newAverageCommentsPerPost);
    }

}

