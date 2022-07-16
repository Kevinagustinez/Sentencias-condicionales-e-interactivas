package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        condicionalesEx1();
        condicionalesEx2();
    }

    private static void condicionalesEx2() {
        Scanner in = new Scanner(System.in);
        String producto =ingresarString(in, "Que producto va a llevar?");
        double precio= ingresarDouble(in,"¿Que precio tiene el producto?");
        ingresarForma(in, precio,producto);
    }

    private static void ingresarForma(Scanner in, double precio, String producto) {
       double resultado=0;
       double desc=0d;

        do {
            System.out.println("¿Que metodo de pago elegirias?");
            System.out.println("1) Contado tiene 15% de descuento");
            System.out.println("2) Debito mismo precio al ingresado");
            System.out.println("3) Tarjeta 10% de recargo");
            desc = in.nextInt();

            if (desc == 1) {
                resultado = precio - (precio / 100 * 15);
                System.out.println("Usted lleva " + producto + " a un valor de $" + resultado);

            } else if (desc == 2) {
                resultado = precio;
                System.out.println("Usted lleva " + producto + " a un valor de $" + resultado);
            } else if (desc == 3) {
                resultado = precio + (precio / 100 * 10);
                System.out.println("Usted lleva " + producto + " a un valor de $" + resultado);
            } else {
                System.out.println("Disculpe la opcion deseada es incorrecta. Intentelo de nuevo");
            }
        }while (desc>3 || desc<0);
    }

    private static double ingresarDouble(Scanner in, String text) {
        System.out.println(text);
        return in.nextDouble();
    }
    private static String ingresarString(Scanner input, String text) {
        System.out.println(text);
        return input.nextLine();
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