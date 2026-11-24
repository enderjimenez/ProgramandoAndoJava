package Guia2;

import javax.swing.JOptionPane;

public class Ejercicio5 {

    public  void NEntre1y100()

    {
        int numero = 0;
        boolean valido = false;

        while (!valido) {
            try {
                String entrada = JOptionPane.showInputDialog("Ingresa un número entre 1 y 100:");

                if (entrada == null) {
                    JOptionPane.showMessageDialog(null, "Operación cancelada.");
                    return;
                }

                numero = Integer.parseInt(entrada.trim());

                if (numero < 1 || numero > 100) {
                    throw new IllegalArgumentException("Fuera de rango");
                }

                valido = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: ingresa un número entero válido.");
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, "Error: el número debe estar entre 1 y 100.");
            }
        }

        JOptionPane.showMessageDialog(null, "Número aceptado: " + numero);
    }
    
}