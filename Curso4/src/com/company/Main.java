package com.company;

public class Main {

    public static void main(String[] args) {
        interactivosEx2();
    }

    private static void interactivosEx2() {
        int i=0;
        imprimirSec(i);
    }

    private static void imprimirSec(int i) {
        for(i=1; i<11; i++){
            System.out.print(" "+ i +" ");
        }
    }
}