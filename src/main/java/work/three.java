package work;

import javax.swing.*;

public class three {
    public static void main(String[] args) {
        int n = getNumber("Ingrese el tamaño del arreglo:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = getNumber("Ingrese el elemento " + (i + 1) + ":");
        }
        int max = searchMax(arr);
        JOptionPane.showMessageDialog(null, "El máximo elemento del arreglo es: " + max);
    }

    public static int getNumber(String mensaje) {
        String input = JOptionPane.showInputDialog(null, mensaje);
        return Integer.parseInt(input);
    }

    public static int searchMax(int[] arr) {
        return recursiveSearchMax(arr, 0, arr[0]);
    }

    public static int recursiveSearchMax(int[] arr, int index, int max) {
        if (index == arr.length) {
            return max;
        }
        if (arr[index] > max) {
            max = arr[index];
        }
        return recursiveSearchMax(arr, index + 1, max);
    }
}
