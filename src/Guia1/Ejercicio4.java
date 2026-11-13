// Solicite dos numeros y un operador (+, -, *, /). Realice la operacion con switch. Valide la division entre cero.
package Guia1;

import java.util.Scanner;

public class Ejercicio4 {
   
    public void CalculadoraPorSignos() {

        Scanner ScannerNumeros = new Scanner(System.in);
        Scanner ScannerOperador = new Scanner(System.in);

        System.out.println("Ingrese el primer número");
        double numero1 = ScannerNumeros.nextDouble();

        System.out.println("Ingrese el segundo número");
        double numero2 = ScannerNumeros.nextDouble();

        System.out.println("Ingrese un operador para la operacion (+, -, *, /)");
        String operador = ScannerOperador.next();

        switch (operador) {
            case "+":
                double suma;
                suma = numero1 + numero2;
                System.out.println("EL valor de la suma de sus dos números es: "+suma);
                break;

            case "-":
                double resta;
                resta = numero1 - numero2;
                System.out.println("EL valor de la resta de sus dos números es: "+resta);
                break;
            case "*":
                double multiplicacion;
                multiplicacion = numero1 * numero2;
                System.out.println("EL valor de la multiplicación de sus dos número es: "+multiplicacion);
                break;
            case "/":
                if (numero2 == 0) {
                    System.out.println("No se puede dividir por cero");
                }else{
                    double division;
                    division = numero1 / numero2;
                    System.out.println("EL valor de la división de sus dos número es: "+division);
                }
                break;
            

            default:
                System.out.println("Operación no válida");
                break;
        }

    }
}
