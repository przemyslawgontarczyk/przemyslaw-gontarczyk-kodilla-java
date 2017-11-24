package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userId;
    private final String userName;
    private final char sex;
    private final LocalDate bornDate;
    private final int postsPublicated;

    public ForumUser(int userId, String userName, char sex, LocalDate bornDate, int postsPublicated) {
        this.userId = userId;
        this.userName = userName;
        this.sex = sex;
        this.bornDate = bornDate;
        this.postsPublicated = postsPublicated;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBornDate() {
        return bornDate;
    }

    public int getPostsPublicated() {
        return postsPublicated;
    }

    @Override
    public String toString() {
        return
                " userId" +
                        ", userName='" + userName + '\'' +
                        ", sex=" + sex +
                        ", bornDate=" + bornDate +
                        ", postsPublicated=" + postsPublicated + '\n';
    }
}
