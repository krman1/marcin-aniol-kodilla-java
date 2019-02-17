package com.kodilla.testing.forum.statistics;


public class ForumStatistic {

    int userQuantity;
    int postsQuantity;
    int commentsQuantity;
    double numberPostsPerUser;
    double numberCommentsPerUser;
    double numberCommentsPerPosts;
    Statistics statistics;


    public void calculateAdvStatistics(Statistics statistics){

        userQuantity = statistics.usersNames().size();
        postsQuantity = statistics.postsCount();
        commentsQuantity = statistics.commentsCount();

        if (userQuantity != 0) {
            numberPostsPerUser = postsQuantity / userQuantity;
        }
        else {
            numberPostsPerUser = 0;
        }

        if (userQuantity != 0) {
            numberCommentsPerUser = commentsQuantity / userQuantity;
        }
        else {
            numberPostsPerUser = 0;
        }
        if (postsQuantity != 0) {
            numberCommentsPerPosts = commentsQuantity / postsQuantity;
        }
        else {
            numberPostsPerUser = 0;
        }


    }
    public void showStatistics() {

        System.out.println("Średnią liczbę postów na użytkownika wynosi: " + numberPostsPerUser);
        System.out.println("Średnią liczbę komentarzy na użytkownika wynosi: " + numberCommentsPerUser);
        System.out.println("Średnią liczbę komentarzy na post wynosi: " + numberCommentsPerPosts);

    }

    public int getUserQuantity() {
        return userQuantity;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    public int getCommentsQuantity() {
        return commentsQuantity;
    }

    public double getNumberPostsPerUser() {
        return numberPostsPerUser;
    }

    public double getNumberCommentsPerUser() {
        return numberCommentsPerUser;
    }

    public double getNumberCommentsPerPosts() {
        return numberCommentsPerPosts;
    }

    public Statistics getStatistics() {
        return statistics;
    }
}
