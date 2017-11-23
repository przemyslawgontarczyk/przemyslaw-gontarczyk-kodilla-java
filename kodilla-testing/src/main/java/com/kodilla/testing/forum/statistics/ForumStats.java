package com.kodilla.testing.forum.statistics;

public class ForumStats {

    int usersCount;
    int postsCount;
    int commentsCount;
    double averagePostsPerUser;
    double averageCommentsPerUser;
    double averageCommentsPerPost;


    public void calculateAdvStatistics(Statistics statistics) {
        usersCount = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
        if (usersCount > 0 ) {
            averagePostsPerUser = (double)postsCount / usersCount;
        }
        if (usersCount > 0) {
            averageCommentsPerUser = ((double)commentsCount / usersCount);
        }
        if (postsCount > 0) {
            averageCommentsPerPost = ((double)commentsCount / postsCount);
        }
    }

    @Override
    public String toString() {
        return "Forum Stats {" +
                "Users =" + usersCount +
                ", Posts =" + postsCount +
                ", Comments =" + commentsCount +
                ", AveragePostsPerUser=" + averagePostsPerUser +
                ", AverageCommentsPerUser=" + averageCommentsPerUser +
                ", AverageCommentsPerPost=" + averageCommentsPerPost +
                '}';
    }

    public int getUsersCount() {
        return usersCount;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    public void ShowStatistics() {

        System.out.println("Forum stats: " + usersCount + postsCount + commentsCount + averagePostsPerUser + averageCommentsPerPost + averageCommentsPerPost);

    }

}




