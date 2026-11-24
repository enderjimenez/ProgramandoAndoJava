package Guia2;

import javax.swing.JOptionPane;

public class Guia2Main {
    public void Guia2() {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresando a los Ejercicios De la guia 2 \n" +
                "1.Ejercicios Try Catch\n" +
                "2.Ingresando A Ejercicios Con Base De Datos"));

        if (opcion == 1) {
            int subOpcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Seleccione el ejercicio Try-Catch:\n" +
                            "1. Ejercicio 1 - División\n" +
                            "2. Ejercicio 2 - Conversión de temperatura\n" +
                            "3. Ejercicio 3 - Calculadora de IMC\n" +
                            "4. Ejercicio 4 - Acceso a arreglo por índice"));

            if (subOpcion == 1) {
                Ejercicio1 ejercicio1 = new Ejercicio1();
                ejercicio1.Division();
            }
            if (subOpcion == 2) {
                Ejercicio2 ejercicio2 = new Ejercicio2();
                ejercicio2.ConversionTemperatura();
            }
            if (subOpcion == 3) {
                Ejercicio3 ejercicio3 = new Ejercicio3();
                ejercicio3.CalculadoraIMC();
            }
            if (subOpcion == 4) {
                Ejercicio4 ejercicio4 = new Ejercicio4();
                ejercicio4.AccesoArreglo();
            }
            if (subOpcion == 5) {
                 Ejercicio5 ejercicio5 = new Ejercicio5();
                ejercicio5.NEntre1y100();
            }
            if (subOpcion == 6) {
                 Ejercicio6 ejercicio6 = new Ejercicio6();
                ejercicio6.EscTuNombre();
            }
        }

        if (opcion == 2) {
            MainPersistenciaData BaseDatos = new MainPersistenciaData();
            BaseDatos.MenuBaseDeDatos();
        }
    }
}
