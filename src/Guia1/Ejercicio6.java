// Pida una nota entre 0 y 100 y clasifiquela: 90-100 Excelente, 80-89 Bueno, 70-79 Aceptable, 60-69 Insuficiente, <60 Reprobado. Valide el rango.
package Guia1;

import java.util.Scanner;

public class Ejercicio6 {
    
    public void SistemaDeNotas(){
        
        Scanner ScannerNotas = new Scanner(System.in);

        System.out.println("Ingrese una nota entre 0 - 100");
        int nota = ScannerNotas.nextInt();

        if (nota >= 90 && nota <= 100) {
            System.out.println("SUPER EXELENTEE");
        }
        else if(nota <= 89 && nota >=80){
            System.out.println("Bueno");
        }
        else if(nota <= 79 && nota >=70){
            System.out.println("Aceptable");
        }
        else if(nota <= 69 && nota >= 60){
            System.out.println("Insuficiente");
        }
        else if (nota >= 0 && nota <= 60) {
            System.out.println("Reprobado");
        }
        else {
            System.out.println("Nota inválida; Ingrese una nota válida entre 0 - 100");
        }
    }
}
