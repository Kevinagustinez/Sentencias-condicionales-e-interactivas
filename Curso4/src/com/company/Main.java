package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

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

}