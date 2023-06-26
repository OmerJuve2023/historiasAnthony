package util;

public class Mat {
    public static int factorial(int num) {
        if (num == 0) return 1;
        else return num * factorial(num - 1);
    }

    public static long suma(int num) {
        if (num == 1) return 1;
        else return suma(num - 1) + num;
    }
}
