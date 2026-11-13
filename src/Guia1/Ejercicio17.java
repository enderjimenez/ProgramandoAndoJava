// Mostrar la tabla de multiplicar del numero 7 usando un ciclo for

package Guia1;

public class Ejercicio17 {
    
    public void TablaDeMultiplicar7(){

        int numero = 7;

        System.out.println("Tabla de multiplicar del " + numero + ":");
        System.out.println("------------------------------");

        for (int i = 1; i < 11; i++){

            int resultado = numero * i;
            
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
