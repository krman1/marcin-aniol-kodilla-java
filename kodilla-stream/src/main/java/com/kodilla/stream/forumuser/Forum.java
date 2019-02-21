package com.kodilla.stream.forumuser;


import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> theUserList = new ArrayList<>();

    public Forum() {

        theUserList.add(new ForumUser(1, "Jan01", 'M', 1973,10,12,2));
        theUserList.add(new ForumUser(2, "Mar03", 'M', 1989,  4,20,0));
        theUserList.add(new ForumUser(3, "Ola12", 'F', 2003, 2,3,20));
        theUserList.add(new ForumUser(4, "Iwo33", 'F', 1986, 6,21,7));
        theUserList.add(new ForumUser(4, "Pablo", 'M', 1955, 8,3,9));
    }

    public List<ForumUser> getList() {
        return new ArrayList<>(theUserList);
    }
}

