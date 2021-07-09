package com.epam.test.automation.java.practice2;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.*;

public class Main {

    /**
     * <summary>
     * Implement code according to description of task 1.
     * </summary>
     */
    public static int task1(int value) {
        int sum = 0;


        List<String> numbersListToString = Arrays.asList(String.valueOf(value).split(""));
        List<Integer> newListStringValueToInteger = new ArrayList<>(numbersListToString.size());
        for (String myInt : numbersListToString) {
            newListStringValueToInteger.add(Integer.valueOf(myInt));
        }
        for (Integer number : newListStringValueToInteger) {
            if (number < 0 || number == 0) {
                throw new IllegalArgumentException();
            }
        }

        newListStringValueToInteger.removeIf(number -> number % 2 == 0);
        Collections.sort(newListStringValueToInteger);

        for (Integer integer : newListStringValueToInteger) {
            sum += integer;
        }
        return sum;
    }

    /**
     * <summary>
     * Implement code according to description of task 2.
     * </summary>
     */
    public static int task2(int n) {
        /*
        For a positive integer n calculate the result value, which is equal to the amount of the “1” in the binary

representation of n.

Example,

n = 14 = 1110 result = 3

n = 128 = 1000 0000 result = 1
         */
        String binaryString = "";
        double convertedDouble = 0;

        if (n > 0) {
            binaryString = Integer.toString(n);
            for (int i = 0; i < binaryString.length(); i++) {

                if (binaryString.charAt(i) == '1') {
                    int len = binaryString.length() - 1 - i;
                    convertedDouble += Math.pow(2, len);
                }
            }

        } else {
            throw new IllegalArgumentException();
        }
        int convertedInt = (int) convertedDouble;
        return convertedInt;

    }

    /**
     * <summary>
     * Implement code according to description of task 3.
     * </summary>
     */
    public static int task3(int value) {
        //TODO: Delete line below and write your own solution;
        throw new UnsupportedOperationException();
    }

    public static void main(String[] args) {
        System.out.println(task2(100000));
        System.out.println(task2(11000011010100000));
        System.out.println(task2(10110000010));
        System.out.println(task2(1111111111111111111111111111111));


    }


}
