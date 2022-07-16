package com.company;

public class Main {

    public static void main(String[] args) {
        String asterisco="";
        for (int i = 0; i < 7; i++) {
            asterisco += "*";
            System.out.println(asterisco);
        }
        System.out.println("");
        for (int j= 0; j < 7; j++) {
            asterisco = "";
            for (int i = 0; i < 7 - j; i++) {
                asterisco += "*";
            }
            System.out.println(asterisco);
        }
        System.out.println("");
        for (int j= 0; j < 7; j++) {
            asterisco = "";
            for (int i = 0; i < 7 - j - 1; i++) {
                asterisco += " ";
            }
            for (int i = 0; i < j + 1; i++) {
                asterisco += "*";
            }
            System.out.println(asterisco);

        }
    }
}