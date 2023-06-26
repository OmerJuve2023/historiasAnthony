package util;

public class Ordenamiento {
    public static void quickSort(int[] vec, int inicio, int fin) {

        if (inicio >= fin) return;

        int pivote = vec[inicio];
        int elemIzq = inicio + 1;
        int elemDer = fin;

        while (elemIzq <= elemDer) {
            while (elemIzq <= fin && vec[elemIzq] < pivote) {
                elemIzq++;
            }
            while (elemDer > inicio && vec[elemDer] >= pivote) {
                elemDer++;
            }
            if (elemIzq < elemDer) {
                int temp = vec[elemIzq];
                vec[elemIzq] = vec[elemDer];
                vec[elemDer] = temp;
            }
        }
        if (elemDer > inicio) {
            int temp = vec[inicio];
            vec[inicio] = vec[elemDer];
            vec[elemDer] = temp;
        }
        quickSort(vec, inicio, elemDer - 1);
        quickSort(vec, elemDer + 1, fin);
    }

    public static void ordenacionRapida(int vec[]) {
        final int N = vec.length;
        quickSort(vec, 0, N - 1);
    }

    public static void imprimirVector(int vec[]) {
        for (int i = 0; i < vec.length; i++) {
            System.out.println(vec[i] + "\t");
        }
    }
}
