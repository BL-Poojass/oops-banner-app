package com.banner.app;

import java.util.*;

public class UC5_OOPSBanner {

    static Map<Character, String[]> patterns = new HashMap<>();

    static {
        patterns.put('O', new String[]{
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        });
        patterns.put('P', new String[]{
            "**** ",
            "*   *",
            "**** ",
            "*    ",
            "*    "
        });
        patterns.put('S', new String[]{
            " ****",
            "*    ",
            " *** ",
            "    *",
            "**** "
        });
    }

    public static void printBanner(String word) {
        word = word.toUpperCase();
        for (int row = 0; row < 5; row++) {
            for (char ch : word.toCharArray()) {
                System.out.print(patterns.get(ch)[row] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printBanner("OOPS");
    }
}
