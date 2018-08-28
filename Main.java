package com.company;

import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public static int getInt() {
        int num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println(" You made mistake. Please repeat");
            scanner.next();
            num = getInt();
        }
        return num;
    }

    public static char getOperation() {
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("You made mistake. Try again");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public int calculate(int num1, int num2, char operation) {
        int sum = 0;
        switch (getOperation()){
            case '+':
                sum = num1 + num2;
            case '-':
                sum = num1 - num2;
            case '*':
                sum = num1 * num2;
            case '/':
                sum = num1 / num2;
                sum = calculate(num1,num2, getOperation());
        }return sum;
    }
}

