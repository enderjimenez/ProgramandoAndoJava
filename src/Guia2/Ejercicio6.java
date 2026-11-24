package Guia2;

import javax.swing.JOptionPane;

public class Ejercicio6 {
    
    public void EscTuNombre()
     {
        try {
            String nombre = JOptionPane.showInputDialog("Escribe tu nombre:");

            if (nombre != null && nombre.trim().isEmpty()) {
                throw new IllegalArgumentException("El nombre no puede estar vacío.");
            }

            String saludo = nombre.trim().toUpperCase();
            JOptionPane.showMessageDialog(null, "¡Hola, " + saludo + "!");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Cancelaste la operación. El nombre es obligatorio.");
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
}