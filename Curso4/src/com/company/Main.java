package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double Matematicas = 0d;
        double Biologia = 0d;
        double Quimica = 0d;
        double promedio = 0d;
        Scanner in = new Scanner(System.in);
        String nombre = "";


        System.out.println("¿Cual es el nombre del alumno?");
        nombre = in.nextLine();

        System.out.println("¿Cual es la nota en la materia Matematicas?");
        Matematicas=in.nextInt();

        System.out.println("¿Cual es la nota en Biologia?");
        Biologia= in.nextInt();

        System.out.println("¿Cual es la nota en la materia Quimica?");
        Quimica=in.nextInt();

        promedio = (Matematicas + Biologia + Quimica) / 3;


        if (promedio >= 6 && promedio < 9) {
            System.out.println("El alumno " + nombre + " aprobo con un promedio de " + promedio);

        } else if (promedio >= 1 && promedio < 6) {
            System.out.println("El alumno " + nombre + " desaprobo con un promedio de " + promedio);
        } else if (promedio >=9 && promedio <=10) {
            System.out.println("El alumno " + nombre + " promociono con un promedio de " + promedio);
        }
    }
}