package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WeightForWeight {
    //Code Wars Link: https://www.codewars.com/kata/55c6126177c9441a570000cc/java
    //
    //Description
    //
    //My friend John and I are members of the "Fat to Fit Club (FFC)". John is worried because each month a list with the weights of members is published and each month he is the last on the list which means he is the heaviest.
    //
    //I am the one who establishes the list so I told him: "Don't worry any more, I will modify the order of the list". It was decided to attribute a "weight" to numbers. The weight of a number will be from now on the sum of its digits.
    //
    //For example 99 will have "weight" 18, 100 will have "weight" 1 so in the list 100 will come before 99.
    //
    //Given a string with the weights of FFC members in normal order can you give this string ordered by "weights" of these numbers?
    //
    //Example:
    //"56 65 74 100 99 68 86 180 90" ordered by numbers weights becomes:
    //
    //"100 180 90 56 65 74 68 86 99"
    //When two numbers have the same "weight", let us class them as if they were strings (alphabetical ordering) and not numbers:
    //
    //180 is before 90 since, having the same "weight" (9), it comes before as a string.
    //
    //All numbers in the list are positive numbers and the list can be empty.
    //
    //Notes
    //it may happen that the input string have leading, trailing whitespaces and more than a unique whitespace between two consecutive numbers
    //For C: The result is freed.

    public static String orderWeight(String str) {

        List<String> newStr = new ArrayList<>();
        List<String> ch = new ArrayList<>();        // First step, need to separate the numbers inside the str to themselves, knowing it could start with a blank per the notes.
        for (int i = 0; i < str.length(); i++){

            if(!Character.isDigit(str.charAt(i))){
                if(!ch.isEmpty()){
                    for(int k = 0; k < ch.size(); k++){
                        newStr.add(ch.get(k));
                        System.out.println(ch.get(k));
                    }
                }
                ch.clear();
                }

            if(Character.isDigit(str.charAt(i))){
              //  System.out.println(str.charAt(i));
                ch.add(str.substring(i));
            }
        }


        //String result = newStr.stream().map(n -> String.valueOf(n)).collect(Collectors.joining(" ", "", ""));
       // System.out.println(result);
        return newStr.toString();
    }
}
