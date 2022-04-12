package com.company.app;

public class ImprimirDatos {

    public static void main(String[] args) {
        // write your code here
        printData();
    }

    public static void printData() {
        int entero = 30;
        System.out.println("Integer= "+entero);
        long largo = 70l;
        System.out.println("Long= "+largo);
        double doble = 40.55;
        System.out.println("Double= "+doble);
        boolean verdadero = true;
        System.out.println("Boolean= "+verdadero);
        String tema1 = "Tema1";
        System.out.println("String= "+tema1);
    }
}
