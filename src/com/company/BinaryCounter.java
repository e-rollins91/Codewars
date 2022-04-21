package com.company;

public class BinaryCounter {


    // Code Wars challenge details below:
    //
    // https://www.codewars.com/kata/526571aae218b8ee490006f4/java
    //
    // Write a function that takes an integer as input, and returns the number of bits that are equal to one in the binary representation of that number. You can guarantee that input is non-negative.
    //
    //Example: The binary representation of 1234 is 10011010010, so the function should return 5 in this case


    // First I get the int into binary form
    static void testRuns(int num){
        //  Testing how things work.
        //System.out.println(Integer.toBinaryString(num));
        System.out.println(countOnes((num)));
    }
    //
    static int countOnes(int n) {

        // Return the number of 1's in the binary string of the int provided.
        String num = Integer.toBinaryString(n);
        int oneCount = 0;
        char[] ch = num.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '1') {
                // System.out.println(ch[i]);
                oneCount++;
            }
        }

        return oneCount;
    }
}
