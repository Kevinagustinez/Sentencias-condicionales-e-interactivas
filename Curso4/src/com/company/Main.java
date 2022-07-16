package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        condicionalesEx1();
    }

    private static void condicionalesEx1() {
        Scanner in= new Scanner(System.in);
        int num_uno = ingresarInt(in, "Dame el primer numero para tu comparacion ");
        int num_dos= ingresarInt(in, "Dame el segundo numero para tu comparacion");
        numerosInt(num_uno , num_dos);
    }

    private static int ingresarInt(Scanner lector, String text) {
        System.out.println(text);
        return lector.nextInt();
    }
    private static void numerosInt(int num_uno, int  num_dos) {
        if (num_uno>num_dos){
            System.out.println(num_uno + " es el numero mayor");
        }else if (num_uno<num_dos){
            System.out.println(num_dos + " es el numero mayor");
        }else{
            System.out.println("Ambos numeros son iguales");
        }
    }
}