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
        if (n > 0) {
            String binaryString = "";
            int valueOfOneInBinaryString = 0;
            binaryString = Integer.toString(n, 2);
            List<String> binaryStringSeparator = Arrays.asList(binaryString.split("")); //separator
            List<Integer> listOfSeparatedNumbersToInteger = new ArrayList<Integer>(binaryStringSeparator.size()); // convert to int array
            for (String myInt : binaryStringSeparator) {
                listOfSeparatedNumbersToInteger.add(Integer.valueOf(myInt));
            }
            listOfSeparatedNumbersToInteger.removeIf(number -> number == 0); // if n == 0 delete from array of int
            for (Integer integer : listOfSeparatedNumbersToInteger) {   //sum of array
                valueOfOneInBinaryString += integer;
            }
            return valueOfOneInBinaryString;
        } else {
            throw new IllegalArgumentException();
        }
    }

    /**
     * <summary>
     * Implement code according to description of task 3.
     * </summary>
     */
    public static int task3(int value) {
        int ifOne;

        if (value > 1) {
            int resultValueOfIntegersBeforeInput = 0;
            List<Integer> fiboNumbersList = new ArrayList<>();
            int first = 0;
            int second = 1;
            int fib;
            fiboNumbersList.add(first);
            fiboNumbersList.add(second);

            for (int i = 2; i < value; i++) {
                fib = second + first;
                first = second;
                second = fib;
                fiboNumbersList.add(fib);
            }
            for (Integer integer : fiboNumbersList) {   //sum of array
                resultValueOfIntegersBeforeInput += integer;
            }
            return resultValueOfIntegersBeforeInput;
        }else if (value == 1){
            ifOne = 0;
            return ifOne;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
