package com.banner.app;

public class UC4_OOPSBanner {

    public static void printOOPS() {
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

    public static void main(String[] args) {
        printOOPS();
    }
}
