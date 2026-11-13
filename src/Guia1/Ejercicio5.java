package Guia1;

import java.util.Scanner;

// Pida un anio y determine si es bisiesto. Reglas: divisible entre 4, no entre 100, excepto si es divisible entre 400

public class Ejercicio5 {
    

    public void CalcularAnioBisiesto() {

        Scanner ScannerBisiesto = new Scanner(System.in);

        System.out.println("Ingrese un año para ver si es bisiesto: ");
        
        int anio = ScannerBisiesto.nextInt();

        if (anio %4 == 0 && anio % 100 !=0){
            System.out.println("El año ingredaso es bisiesto: "+anio);
        }else{
            System.out.println("El año no es bisiesto: "+anio);
        }
    }
}
