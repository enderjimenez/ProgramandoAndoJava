package Guia1;

import java.util.Scanner;

public class GuiaMain {
    
    public void Guia1(){
        System.out.println(" --- Bienvenido a la lista de ejercicios Guia 1 ---\n");
        System.out.println("1.Ejercicios Estructura Condicionales");
        System.out.println("2.Ejercicios Practico: Ciclos for, while y areglos.");

        Scanner lector = new Scanner(System.in);
        
        System.out.println("\nIngrese una opcion de Ejercicio: ");
        int opcion = lector.nextInt();

        if (opcion == 1){
            System.out.println("1.Ejercicios Estructura Condicionales\n");
            System.out.println("Lista de Ejercicios\n");
            System.out.println("4. Solicite dos numeros y un operador (+, -, *, /). Realice la operacion con switch. Valide la division entre cero.");
            System.out.println("5.  Pida un anio y determine si es bisiesto. Reglas: divisible entre 4, no entre 100, excepto si es divisible entre 400");
            System.out.println("6. Pida una nota entre 0 y 100 y clasifiquela: 90-100 Excelente, 80-89 Bueno, 70-79 Aceptable, 60-69 Insuficiente, <60 Reprobado. Valide el rango.");
            System.out.println("7. Solicite tres numeros e imprima cual es el mayor. Extra: si hay empate entre dos o los tres, indicarlo.");
            System.out.println("10. Solicite peso (kg) y altura (m). Calcule IMC = peso / (altura * altura). Clasifique: <18.5 Bajo peso, 18.5-24.9 Normal, 25-29.9 Sobrepeso, >=30 Obesidad.\n");

            opcion = lector.nextInt();

            if (opcion == 4) {
                Ejercicio4();
            }
            if(opcion == 5){
                Ejercicio5();
            }
            if(opcion == 6){
                Ejercicio6();
            }
            if(opcion == 7){
                Ejercicio7();
            }
            if(opcion == 10){
                Ejercicio10();
            }
            
            

        }else if (opcion == 2) {
            System.out.println("\n2.Ejercicios Practico: Ciclos for, while y areglos.\n");
            System.out.println("Lista de Ejercicios\n");
            System.out.println("16. Calcular la suma de los numeros impares del 1 al 50 usando un ciclo for");
            System.out.println("17. Mostrar la tabla de multiplicar del numero 7 usando un ciclo for");
            System.out.println("18. Mostrar las tablas de multiplicar del 1 al 10 usando ciclos for anidados");


            opcion = lector.nextInt();

            if(opcion == 16){
                Ejercicio16();
            }
            if(opcion == 17){
                Ejercicio17();
            }
            if(opcion == 18){
                Ejercicio18();
            }


        }else {
            System.out.println("Ingreso una opcion invalida");
        }
    }

    public void Ejercicio4(){
        Ejercicio4 Calculadora = new Ejercicio4();
        Calculadora.CalculadoraPorSignos();
    }

     public void Ejercicio5(){
        Ejercicio5 Bisiesto = new Ejercicio5();
        Bisiesto.CalcularAnioBisiesto();

    }

     public void Ejercicio6(){
        Ejercicio6 notas = new Ejercicio6();
        notas.SistemaDeNotas();

    }

    public void Ejercicio7(){
        Ejercicio7 Calcular = new Ejercicio7();
        Calcular.CalcularMayor();

    }
    public void Ejercicio10 (){
        Ejercicio10 IMC = new Ejercicio10();
        IMC.CalcularIMC();
    }

    public void Ejercicio16 (){
        Ejercicio16 ImparesConFor = new Ejercicio16();
        ImparesConFor.CalcularSumaImpares();
    }

    public void Ejercicio17 (){
        Ejercicio17 TablaSiete = new Ejercicio17();
        TablaSiete.TablaDeMultiplicar7();
    }

    public void Ejercicio18 (){
        Ejercicio18 Tablas = new Ejercicio18();
        Tablas.TablasDeMultiplicarDelUnoAlDiez();
    }


}
