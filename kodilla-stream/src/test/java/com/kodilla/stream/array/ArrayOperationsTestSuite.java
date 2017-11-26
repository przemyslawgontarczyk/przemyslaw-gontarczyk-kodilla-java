package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test

    public void testGetAverage() {

        //Given
        int[] numbersTest = {1, 2, 3, 1, 4, 3, 12, 1, 2, 1, 3, 12, 1, 3, 7, 1, 2, 5, 1, 20};

        //When
        double averageTest = ArrayOperations.getAverage(numbersTest);

        //Then
        Assert.assertEquals(20, numbersTest.length);
        Assert.assertEquals(4.25, averageTest, 0);
    }
}
