package com.epam.test.automation.java.practice2;

import java.lang.reflect.Array;
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
    public static int task2(int value) {
        //TODO: Delete line below and write your own solution;
        throw new UnsupportedOperationException();
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
        System.out.printf("erty");
    }
}
