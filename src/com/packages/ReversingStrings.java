package com.packages;

public class ReversingStrings {

    public static void main(String[] args) {

        // The string that need to be reverse.
        String given = "Today is a beautiful day";

        for(int i=given.length()-1; i>=0; i--)
        {
            System.out.print(given.charAt(i));
        }
    }
}