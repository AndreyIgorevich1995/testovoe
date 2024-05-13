package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] a = {42, 12, 18};
//        System.out.println(task1(20));
//        System.out.println(Arrays.toString(task2(a)));
//        System.out.println(Arrays.toString(task3(1, 100)));
//        task4(7);
    }

    public static String task1(int numberOfComputers) {
        int number = numberOfComputers % 10;
        String result = null;
        if (number >= 5 || number == 0) {
            result = numberOfComputers + " компьютеров";
        } else if (number == 1) {
            result = numberOfComputers + " компьютер";
        } else {
            result = numberOfComputers + " компьютера";
        }
        return result;
    }


    public static int[] task2(int[] massiv) {
        List<Integer> numberDivisors = new ArrayList<>();
        Map<Integer, Integer> numberOfDivisors = new HashMap<>();
        List<Integer> divisors = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < massiv.length; i++) {
            for (int j = 2; j <= massiv[i]; j++) {
                if (massiv[i] % j == 0) {
                    numberDivisors.add(j);
                }
            }
        }
        for (int i = 0; i < numberDivisors.size(); i++) {
            if (numberOfDivisors.containsKey(numberDivisors.get(i)) == false) {
                numberOfDivisors.put(numberDivisors.get(i), 1);
            } else {
                numberOfDivisors.put(numberDivisors.get(i), numberOfDivisors.get(numberDivisors.get(i)) + 1);
            }
        }
        divisors.addAll(numberOfDivisors.keySet());
        for (int i = 0; i < divisors.size(); i++) {
            if (numberOfDivisors.get(divisors.get(i)) == massiv.length) {
                result.add(divisors.get(i));
            }
        }
        int[] arrayResult = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            arrayResult[i] = result.get(i);
        }
        return arrayResult;
    }


    public static int[] task3(int min, int max) {
        int[] arrayOfNumbers;
        List<Integer> numberDivisors = new ArrayList<>();
        arrayOfNumbers = new int[(max - min) + 1];
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = min;
            min++;
        }
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            boolean x = true;
            if (arrayOfNumbers[i] <= 1) {
                x = false;
            }
            for (int j = 2; j <= arrayOfNumbers[i] / 2; j++) {
                if (arrayOfNumbers[i] % j == 0) {
                    x = false;
                }
            }
            if (x == true) {
                numberDivisors.add(arrayOfNumbers[i]);
            }
        }
        int[] arrayResult = new int[numberDivisors.size()];
        for (int i = 0; i < numberDivisors.size(); i++) {
            arrayResult[i] = numberDivisors.get(i);
        }
        return arrayResult;
    }


    public static void task4(int number) {
        System.out.print("     ");
        for (int i = 0; i < number; i++) {
            System.out.format("%5d", i + 1);
        }
        System.out.println();
        for (int i = 0; i < number; i++) {
            System.out.format("%5d", i + 1);
            for (int j = 0; j < number; j++) {
                System.out.format("%5d", (i + 1) * (j + 1));
            }
            System.out.println();
        }
    }
}