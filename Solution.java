package com.company;

import java.util.*;
import java.io.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        for (int i = 0; i<= x; i++){
            String str = scanner.nextLine();
            if (str.indexOf(i) % 2 == 0){
                System.out.println(str.charAt(i));
            }
        }
    }
}