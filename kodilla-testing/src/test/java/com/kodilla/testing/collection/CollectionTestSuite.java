package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;
import java.util.*;

public class CollectionTestSuite {

        @Before
        public void before () {
            System.out.println("\nTesting:");
        }

        @After
        public void after () {
            System.out.println("End of testing");
        }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        System.out.println("Empty List");
        OddNumbersExterminator EmpytList = new OddNumbersExterminator();//obiekt OddNumbersExterminator powinien byc na poziomie klasy, a kontruktor w metodzie before
        ArrayList<Integer> input = new ArrayList<>();
        //When
        List <Integer> output = EmpytList.exterminate(input);
        //Then
        Assert.assertEquals(0, output.size());
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        System.out.println("Normal List, sorting for even and odd numbers");
        OddNumbersExterminator newList = new OddNumbersExterminator();//obiekt OddNumbersExterminator powinien byc na poziomie klasy, a kontruktor w metodzie before
        List<Integer> expectedOutput= Arrays.asList(2,4);
        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);
        input.add(4);
        //When
        List <Integer> output = newList.exterminate(input);
        //Then
        Assert.assertTrue(expectedOutput.equals(output));//assertEquals nie działa za dobrze na listach
        //trzeba sprawdzać wartości, a nie tylko rozmiary
    }

}
