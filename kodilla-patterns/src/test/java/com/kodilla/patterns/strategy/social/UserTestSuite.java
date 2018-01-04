package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.FacebookPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {

        //Given
        User janek = new YGeneration("Janek Strong");
        User stella = new ZGeneration("Stella Brick");
        User mack = new Millenials("Mack Book");

        //When
        String janekPub = janek.sharePost();
        System.out.println("Janek posted " + janekPub);
        String stellaPub = stella.sharePost();
        System.out.println("Stella posted " + stellaPub);
        String mackPub = mack.sharePost();
        System.out.println("Mack posted " + mackPub);

        //Then
        Assert.assertEquals("Using Twitter", janekPub);
        Assert.assertEquals("Using SnapChat", stellaPub);
        Assert.assertEquals("Using FaceBook", mackPub);
    }

    @Test
    public void testIndividualSharingStrategy() {

        //Given
        User janek = new YGeneration("Janek Strong");

        //When
        String janekPub = janek.sharePost();
        System.out.println("Janek posted " + janekPub);
        janek.setProperPublisher(new FacebookPublisher());
        janekPub = janek.sharePost();
        System.out.println("Janek posted " + janekPub);

        //Then

        Assert.assertEquals("Using FaceBook", janekPub);
    }
}
