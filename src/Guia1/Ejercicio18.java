// Mostrar las tablas de multiplicar del 1 al 10 usando ciclos for anidados

package Guia1;

public class Ejercicio18 {
    
    public void TablasDeMultiplicarDelUnoAlDiez(){

        for (int i = 1; i < 11; i++){
            
            System.out.println("Tabla de multiplicar del " + i + ":");
            System.out.println("------------------------------");

            for (int j = 1; j < 11; j++){

                int resultado = i * j;

                System.out.println(i + " x " + j + " = " + resultado);
            }

            System.out.println();

        }
    }
}
