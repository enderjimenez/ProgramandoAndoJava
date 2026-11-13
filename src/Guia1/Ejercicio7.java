package Guia1;

import java.util.Scanner;

// Solicite tres numeros e imprima cual es el mayor. Extra: si hay empate entre dos o los tres, indicarlo.

public class Ejercicio7 {

    public void CalcularMayor() {

        Scanner ScannerMayor = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        double num1 = ScannerMayor.nextDouble();

        System.out.println("Ingrese el segundo número: ");
        double num2 = ScannerMayor.nextDouble();

        System.out.println("Ingrese el tercer número: ");
        double num3 = ScannerMayor.nextDouble();

        if (num1 == num2 && num2 == num3) {
            System.out.println("Empate total: Los tres números son iguales a " + num1);
        } else if (num1 == num2 && num1 > num3) {
            System.out.println("Empate parcial: El primer y segundo número son los mayores (" + num1 + ")");
        } else if (num1 == num3 && num1 > num2) {
            System.out.println("Empate parcial: El primer y tercer número son los mayores (" + num1 + ")");
        } else if (num2 == num3 && num2 > num1) {
            System.out.println("Empate parcial: El segundo y tercer número son los mayores (" + num2 + ")");
        } else if (num1 > num2 && num1 > num3) {
            System.out.println("El número mayor es el primero: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El número mayor es el segundo: " + num2);
        } else {
            System.out.println("El número mayor es el tercero: " + num3);
        }
    }
}