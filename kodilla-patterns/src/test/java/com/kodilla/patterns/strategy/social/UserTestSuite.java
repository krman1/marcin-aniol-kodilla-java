package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User marcin123 = new Millenials("Marcin");
        User ola23 = new YGeneration("Ola");
        User pawel1 = new ZGeneration("Paweł");

        //When
        String facebook = marcin123.socialPublisher.share();
        String tweeter = ola23.socialPublisher.share();
        String snapchat = pawel1.socialPublisher.share();

        //Then
        Assert.assertEquals("This user use FacebookPublisher", facebook);
        Assert.assertEquals("This user use TwitterPublisher", tweeter);
        Assert.assertEquals("This user use SnapchatPublisher", snapchat);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User marcin123 = new Millenials("Marcin");

        //When
        String changeSocialPublisher = marcin123.socialPublisher.share();
        System.out.println(changeSocialPublisher);
        marcin123.setSocialPublishing(new TwitterPublisher());
        changeSocialPublisher = marcin123.socialPublisher.share();
        System.out.println(changeSocialPublisher);

        //Then
        Assert.assertEquals("This user use TwitterPublisher", changeSocialPublisher);
    }
}
