package com.kodilla.testing.collection;



import java.util.*;

public class OddNumbersExterminator {

    ArrayList <Integer> exterminate(ArrayList<Integer> numbers){

    for ( int i=0; i<numbers.size(); i++){

       if (numbers.get(i) %2 ==0){
       }
       else{numbers.remove(i);
       }
    }

        return  numbers ;


    }
}

