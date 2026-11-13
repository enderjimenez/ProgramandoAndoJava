// Calcular la suma de los numeros impares del 1 al 50 usando un ciclo for

package Guia1;

public class Ejercicio16 {
    
    public void CalcularSumaImpares(){

        int suma = 0;

        for (int i = 1; i <= 50; i++){
            
            if (i % 2 != 0) {
                suma = suma + i;
            }
        }
        System.out.println("La suma de los número impares del 1 al 50 es: "+suma);
    }
}
