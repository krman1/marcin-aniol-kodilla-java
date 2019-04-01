package com.kodilla.patterns.strategy.social;



public class User {

    private String userName;
    protected SocialPublisher socialPublisher;

    public User(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }
    public void share(String post) {
        System.out.println("The post [" + post + "] will be shared on: ");
        socialPublisher.share();
    }

    public void setSocialPublishing(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}
