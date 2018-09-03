package com;

import java.util.*;

public class Solution {

    public static Object getDay (String day,String month,String year){
        Calendar cal = Calendar.getInstance();
        cal.set(Integer.valueOf(day),Integer.valueOf(month),Integer.valueOf(year));
         return cal.get(Calendar.DAY_OF_WEEK);

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();

        System.out.println(getDay(day, month, year));
    }
}


