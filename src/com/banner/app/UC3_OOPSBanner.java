package com.banner.app;

public class UC3_OOPSBanner {
    public static void main(String[] args) {
        String[] banner = {
            " ***   ***   *****   ***** ",
            "*     *   *  *       *     ",
            "*     *   *  *****   ***** ",
            "*     *   *  *           * ",
            " ***   ***   *****   ***** "
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}
