package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        condicionalesEx3();
    }

    private static void condicionalesEx3() {
        double promedio = 0d;
        Scanner in = new Scanner(System.in);
        String nombre= ingresarNombre(in,"Ingrese el nombre del alumno: ");
        double Matematicas=notaMatematicas(in,"¿Cual es la nota en la materia Matematicas?: ");
        double Biologia= notaBiologia(in,"¿Cual es la nota en la materia Biologia?: ");
        double Quimica=notaQuimica(in,"¿Cual es la nota en la materia Quimica?: ");
        notasPromedio(nombre,Matematicas,Biologia,Quimica, promedio);
    }

    private static double notaQuimica(Scanner in, String s) {
        System.out.println(s);
        return in.nextDouble();
    }

    private static double notaBiologia(Scanner in, String s) {
        System.out.println(s);
        return in.nextDouble();
    }

    private static double notaMatematicas(Scanner in, String s) {
        System.out.println(s);
        return in.nextDouble();
    }

    private static String ingresarNombre(Scanner in, String s) {
        System.out.println(s);
        return in.nextLine();
    }

    private static void notasPromedio(String nombre, double biologia, double quimica, double promedio, double matematicas) {
        promedio = (matematicas + biologia + quimica) / 3;

        if (promedio >= 6 && promedio < 9) {
            System.out.println("El alumno " + nombre + " aprobo con un promedio de " + promedio);
        } else if (promedio >= 1 && promedio < 6) {
            System.out.println("El alumno " + nombre + " desaprobo con un promedio de " + promedio);
        } else if (promedio >=9 && promedio <=10) {
            System.out.println("El alumno " + nombre + " promociono con un promedio de " + promedio);

        }
    }
}