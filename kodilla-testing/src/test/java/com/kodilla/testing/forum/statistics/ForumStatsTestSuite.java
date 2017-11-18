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
    int commentsCount;

    @Before
    public void before() {
        forumStats = new ForumStats();
        statisticsMock = mock(Statistics.class);
    }

    @Test
    public void testForumPosts0WithMock() {

        //Given
        postsCount = 0;
        commentsCount = 0;
        when(statisticsMock.postsCount()).thenReturn(postsCount);

        //When
        forumStats.calculateAdvStatistics(statisticsMock);
        postsCount = forumStats.getPostsCount();

        //Then
        Assert.assertEquals(0, postsCount);
    }

    @Test
    public void testForumPosts1000WithMock() {

        //Given
        postsCount = 1000;
        commentsCount = 0;
        when(statisticsMock.postsCount()).thenReturn(postsCount);

        //When
        forumStats.calculateAdvStatistics(statisticsMock);
        postsCount = forumStats.getPostsCount();

        //Then
        Assert.assertEquals(1000, postsCount);
    }

    @Test
    public void testForumComments0WithMock() {

        //Given
        postsCount = 0;
        commentsCount = 0;
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        //When
        forumStats.calculateAdvStatistics(statisticsMock);
        commentsCount = forumStats.getCommentsCount();

        //Then
        Assert.assertEquals(0, commentsCount);
    }

    @Test
    public void testForumMorePostsWithMock() {

        //Given
        postsCount = 50;
        commentsCount = 10;
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        //When
        forumStats.calculateAdvStatistics(statisticsMock);
        postsCount = forumStats.getPostsCount();
        commentsCount = forumStats.getCommentsCount();

        //Then
        Assert.assertTrue(postsCount > commentsCount);
    }

    @Test
    public void testForumMoreCommentsWithMock() {

        //Given
        postsCount = 10;
        commentsCount = 50;
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        //When
        forumStats.calculateAdvStatistics(statisticsMock);
        postsCount = forumStats.getPostsCount();
        commentsCount = forumStats.getCommentsCount();

        //Then
        Assert.assertTrue(postsCount < commentsCount);
    }

    @Test
    public void testForumUsers0WithMock() {

        //Given
        List<String> userNames = Arrays.asList();
        int userNamesCount;
        when(statisticsMock.usersNames()).thenReturn(userNames);

        //When
        forumStats.calculateAdvStatistics(statisticsMock);
        userNamesCount = forumStats.getUsersCount();

        //Then
        Assert.assertEquals(0, userNamesCount);
    }

    @Test
    public void testForumUsers100WithMock() {

        //Given
        List<String> userNames = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            userNames.add("User" + (i));
        }
        int userNamesCount;
        when(statisticsMock.usersNames()).thenReturn(userNames);

        //When
        forumStats.calculateAdvStatistics(statisticsMock);
        userNamesCount = forumStats.getUsersCount();

        //Then
        Assert.assertEquals(100, userNamesCount);
    }

}

