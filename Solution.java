package com.company;
import java.util.*;

public class Solution {
    static Scanner scanner = new Scanner(System.in);
    static int Day;
    static int Month;
    static int Year;


    public static void main(String[] args) {
        Day = scanner.nextInt();
        Month = scanner.nextInt();
        Year = scanner.nextInt();
        System.out.println(getCurrentDate(Day, Month, Year));

    }

    public static int getCurrentDate(int D, int M, int Y) {
        D = scanner.nextInt();
        M = scanner.nextInt();
        Y = scanner.nextInt();

        if ((Day <= D) && (Month <= M) && (Y <= Year)) {
            return 0;
        }

        if ((Day != D) && (Month == M) && (Year == Y)) {
            return 15 * (Day - D);
        }
        if ((Month != M) && (Year == Y)) {
            return 500 * (Month - M);
        }
        if (Y < Year) {
            return 10000;
        }
        return 0;
    }
}