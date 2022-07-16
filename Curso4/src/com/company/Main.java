package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String nombre = "";
        double precio = 0;
        double resultado = 0;
        double desc = 0;
        Scanner in = new Scanner(System.in);


        System.out.println("¿Que producto va a llevar?");
        nombre = in.nextLine();

        System.out.println("¿Que precio tiene el producto?");
        precio = in.nextInt();

        do {
            System.out.println("¿Que metodo de pago elegirias?");
            System.out.println("1) Contado tiene 15% de descuento");
            System.out.println("2) Debito mismo precio al ingresado");
            System.out.println("3) Tarjeta 10% de recargo");
            desc = in.nextInt();

            if (desc == 1) {
                resultado = precio - (precio / 100 * 15);
                System.out.println("Usted lleva " + nombre + " a un valor de $" + resultado);

            } else if (desc == 2) {
                resultado = precio;
                System.out.println("Usted lleva " + nombre + " a un valor de $" + resultado);
            } else if (desc == 3) {
                resultado = precio + (precio / 100 * 10);
                System.out.println("Usted lleva " + nombre + " a un valor de $" + resultado);
            } else {
                System.out.println("Disculpe la opcion deseada es incorrecta. Intentelo de nuevo");
            }
        }while (desc>3 || desc<0);
    }

}