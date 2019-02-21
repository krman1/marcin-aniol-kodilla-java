package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {

    public static void main(String[] args) {

        Forum theUser = new Forum();
        Map<Integer, ForumUser> theResultMapOfUser = theUser.getList().stream()
       // String theResultStringOfUsers = theUser.getList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forum -> forum.getBirthDate().isBefore(LocalDate.now().minusYears(20)))
                .filter(forumUser -> forumUser.getPostsQuantity() > 0)
                .collect(Collectors.toMap(ForumUser::getUserID, forumUser -> forumUser));

        System.out.println("Ilość elementów w mapie: " + theResultMapOfUser.size());
        theResultMapOfUser.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

    }
}

