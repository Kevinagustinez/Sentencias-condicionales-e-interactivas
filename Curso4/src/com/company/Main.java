package com.company;

public class Main {

    public static void main(String[] args) {
        interactivosEx1();
    }

    private static void interactivosEx1() {
        int i=0;
        imprimirFoo(i);
    }

    private static void imprimirFoo(int i) {
        while(i<10){
            System.out.println("foo");
            i++;
        }
    }
}