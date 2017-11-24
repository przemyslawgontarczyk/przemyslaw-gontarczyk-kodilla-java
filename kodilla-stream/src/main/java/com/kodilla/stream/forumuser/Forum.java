package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser>forumUserList = new ArrayList<>();

    public Forum(){
        forumUserList.add(new ForumUser(001,"Jan Kowalski",'F', LocalDate.of(1980,12,12),1));
        forumUserList.add(new ForumUser(002,"John Wick",'M', LocalDate.of(1985,11,05),2));
        forumUserList.add(new ForumUser(003,"Anna Pierd",'F',LocalDate.of(2000,02,20),0));
        forumUserList.add(new ForumUser(004,"Jan Kowalski",'M',LocalDate.of(2011,03,28),1));
        forumUserList.add(new ForumUser(005,"Zaus Kosmateus",'M',LocalDate.of(1965,04,11),15));
        forumUserList.add(new ForumUser(006,"Jack Strong",'M',LocalDate.of(1984,05,13),0));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(forumUserList);
    }
}
