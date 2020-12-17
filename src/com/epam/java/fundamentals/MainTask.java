package com.epam.java.fundamentals;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainTask {

    public void performHelloTask() {
        System.out.println("Enter your name");

        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNext()) {
            System.out.printf("Hello, %s", scanner.next());
        } else {
            System.out.println("Nobody to greet");
        }
        scanner.close();
    }

    public void printDescArgs(String[] args) {
        if (args == null || args.length == 0) {
            System.out.println("Input is empty");
            return;
        }
        for (int i = args.length - 1; i > 0; i--) {
            System.out.println(args[i]);
        }
    }

    public void printRandomNumbersWithOrWithoutNewLine(boolean isNewLineRequired, int... numbers) {
        int index = 0;
        while(index < numbers.length) {
            if (isNewLineRequired) {
                System.out.println(numbers[index]);
            } else {
                System.out.print(numbers[index]);
            }
            index++;
        }
    }

    public void countNumberOfArgs(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }

    public void monthCounter(int... monthOrder) {
        Map<Integer, String> monthMap = new HashMap<>();

        monthMap.put(1, "January");
        monthMap.put(2, "February");
        monthMap.put(3, "March");
        monthMap.put(4, "April");
        monthMap.put(5, "May");
        monthMap.put(6, "June");
        monthMap.put(7, "July");
        monthMap.put(8, "August");
        monthMap.put(9, "September");
        monthMap.put(10, "October");
        monthMap.put(11, "November");
        monthMap.put(12, "December");

        for (int monthNum : monthOrder) {
            if (monthMap.containsKey(monthNum)) {
                System.out.println(monthMap.get(monthNum));
            }
        }
    }
}
