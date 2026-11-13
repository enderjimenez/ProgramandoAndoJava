package Guia1;

import java.util.Scanner;

public class Ejercicio10 {
    public void CalcularIMC() {
        double peso;
        double altura;

        Scanner info = new Scanner(System.in);

        System.out.println("Ingreso al ejercicio 10 de la guia 1");
        System.out.println("Ingrese su peso en kilogramos");
        peso = info.nextDouble();

        System.out.println("Ingrese su altura en metros");
        altura = info.nextDouble();

        double IMC = peso / (altura * altura);

        if (IMC < 18.5) {
            System.out.println("Bajo peso");
        } else if (IMC >= 18.5 && IMC <= 24.9) {
            System.out.println("Peso normal");
        } else if (IMC >= 25 && IMC <= 29.9) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidad");
        }

    }
}
