package com.company;

import java.util.Scanner;

public class solution3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String str = scanner.next();
        String st1 = "";
        String st2 = "";
        for (int a = 0; a < num; a ++) {
            for (int i = 0; i <= str.length() - 1; i++) {
                if (i % 2 == 0) {
                    st1 += str.charAt(i);
                }
                if (i % 2 != 0) {
                    st2 += str.charAt(i);
                }
            }
            System.out.print(st1 + " " + st2);
        }
    }
}
