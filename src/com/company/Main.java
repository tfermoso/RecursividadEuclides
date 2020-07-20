package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner leer=new Scanner(System.in);
        System.out.println("Introduce longitud de la superficie");
        double longitud=leer.nextDouble();
        leer.nextLine();
        System.out.println("Introduce el ancho de la superficie");
        double ancho=leer.nextDouble();
        //double baldosa=calculartamanhoBaldosa(longitud,ancho);
        double baldosa=calculartamanhoBaldosaSinRecursividad(longitud,ancho);
        System.out.println("El tamaño de la badosa es: "+baldosa);
        double numeroBaldosas=calcularNumeroBaldosas(longitud,ancho,baldosa);
        System.out.println("El número de baldosas es: "+numeroBaldosas);

    }

    private static double calcularNumeroBaldosas(double longitud, double ancho, double baldosa) {
        return (longitud/baldosa) * (ancho/baldosa);
    }

    private static double calculartamanhoBaldosa(double longitud, double ancho) {
        if(longitud==ancho) return longitud;
        if(longitud>ancho) return calculartamanhoBaldosa(longitud-ancho,ancho);
        else
            return calculartamanhoBaldosa(longitud,ancho-longitud);
    }

    private static double calculartamanhoBaldosaSinRecursividad(double l, double a){
        double longitud,ancho;
        if(l>=a){
            longitud=l;
            ancho=a;
        }else{
            longitud=a;
            ancho=l;
        }

        while(ancho>1) {
            if (longitud > ancho) {
                if (longitud % ancho == 0) {
                    return ancho;
                } else {
                    ancho -= 1;
                }
            }
        }
        return 1;
    }
}
