package work;

import javax.swing.*;

public class two {
    public static void main(String[] args) {
        int a = getNumber("Ingrese el primer número:");
        int b = getNumber("Ingrese el segundo número:");
        int mcd = calculateMCD(a, b);
        JOptionPane.showMessageDialog(null, "El MCD de " + a + " y " + b + " es: " + mcd);
    }

    public static int getNumber(String mensaje) {
        String input = JOptionPane.showInputDialog(null, mensaje);
        return Integer.parseInt(input);
    }

    public static int calculateMCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return calculateMCD(b, a % b);
        }
    }
}
