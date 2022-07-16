package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num_uno=0;
        int num_dos=0;
        Scanner in= new Scanner(System.in);

        System.out.println("Dame el primer numero para tu comparacion ");
        num_uno= in.nextInt();

        System.out.println("Dame el segundo numero para tu comparacion ");
        num_dos= in.nextInt();

        if (num_uno>num_dos){
            System.out.println(num_uno + " es el numero mayor");
        }else if (num_uno<num_dos){
            System.out.println(num_dos + " es el numero mayor");
        }else{
            System.out.println("Ambos numeros son iguales");
        }
    }
}