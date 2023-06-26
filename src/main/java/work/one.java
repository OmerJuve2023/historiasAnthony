package work;

import javax.swing.*;

public class one {
    public static void main(String[] args) {
        int a = getNumber("Ingrese el primer número:");
        int b = getNumber("Ingrese el segundo número:");
        int product = multi(a, b);
        JOptionPane.showMessageDialog(null, "El product de " + a + " X " + b + " es: " + product);
    }

    public static int getNumber(String mensaje) {
        String input = JOptionPane.showInputDialog(null, mensaje);
        return Integer.parseInt(input);
    }

    public static int multi(int a, int b) {
        if (b == 0) {
            return 0;
        } else if (b > 0) {
            return a + multi(a, b - 1);
        } else {
            return -multi(a, -b);
        }
    }
}
