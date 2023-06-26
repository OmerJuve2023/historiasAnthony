package main;

import util.Mat;

import javax.swing.*;

public class eject {
    static class functionFact {
        public static void main(String[] args) {
            String valor = JOptionPane.showInputDialog("Ingresar valor", null);
            int value = Integer.parseInt(valor);
            long fact = Mat.factorial(value);
            JOptionPane.showMessageDialog(null, "El factorial de " + valor + " es " + fact);
        }
    }


    static class functionSum {
        public static void main(String[] args) {
            String valor = JOptionPane.showInputDialog("Ingresar valor", null);
            int value = Integer.parseInt(valor);
            long fact = Mat.suma(value);
            JOptionPane.showMessageDialog(null, "La suma de los " + valor + " primeros números es " + fact);
        }
    }

}
