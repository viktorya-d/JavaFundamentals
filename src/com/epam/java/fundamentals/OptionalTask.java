package com.epam.java.fundamentals;

import java.util.*;

public class OptionalTask {

    private final List<String> numbers = new ArrayList<>();

    {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            numbers.add(scanner.next());
        }
        scanner.close();
    }

    public void longestShortestNumber() {
        String longestNumber = numbers.get(0);
        String shortestNumber = numbers.get(numbers.size() - 1);

        for (String num : numbers) {
            if (num.length() > longestNumber.length()) {
                longestNumber = num;
            }
            if (num.length() < shortestNumber.length()) {
                shortestNumber = num;
            }
        }
        System.out.printf("Shortest number is %s%n", shortestNumber);
        System.out.printf("Longest number is %s%n", longestNumber);
    }

    public void orderNumber() {
        boolean isNotSorted = true;
        String temp;
        while (isNotSorted) {
            isNotSorted = false;
            for (int i = 0; i < numbers.size() - 1; i++) {
                if (i + 1 < numbers.size() && numbers.get(i).length() > numbers.get(i+1).length()) {
                    temp = numbers.get(i + 1);
                    numbers.set(i + 1, numbers.get(i));
                    numbers.set(i, temp);
                    isNotSorted = true;
                }
            }
        }
        for (String str : numbers) {
            System.out.println(str);
        }
    }

    public void printLowerHigherAverage(boolean isAverageLower) {
        int average = 0;
        for (String str : numbers) {
            average += str.length();
        }
        average = average / numbers.size();
        for (String str : numbers) {
            if (str.length() > average && !isAverageLower) {
                System.out.println("Higher " + str + " " + str.length());
            }
            if (str.length() < average && isAverageLower) {
                System.out.println("Lower " + str + " " + str.length());
            }
        }
    }

    public void differentNumberInEach() {
        int minAmount = numbers.get(0).length();
        String minNumber = numbers.get(0);
        for (String str : numbers) {
            List<Integer> integers = new ArrayList<>();
            for (Character c : str.toCharArray()) {
                Integer i = Integer.valueOf(c);
                if (!integers.contains(i)) {
                    integers.add(i);
                }
            }
            if (minAmount > integers.size()) {
                minAmount = integers.size();
                minNumber = str;
            }
        }
        System.out.println("Min number is " + minNumber);
    }
}
