package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass

    public static void newLog() {
        Logger.getInstance().log("This is a first log");
    }

    @Test

    public void testGetLastLog() {
        //Given
        //When
        String lastLogTester = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals(lastLogTester, "This is a first log");
    }
}
