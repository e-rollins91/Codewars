package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(WeightForWeight.orderWeight("1             2   32"));
        testBinaryCounter();
    }
    static void testBinaryCounter(){
        // Testing the Binary Count code;
        // should be 5
        BinaryCounter.testRuns(1234);
        // should be 7
        BinaryCounter.testRuns(4);
        // should be 9
        BinaryCounter.testRuns(7);
        // should be 10
        BinaryCounter.testRuns(9);
        // should be 15
        BinaryCounter.testRuns(10);
    }

}
