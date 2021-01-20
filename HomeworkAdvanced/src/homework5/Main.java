package homework5;

import java.util.Arrays;

public class Main {
    static final int SIZE = 10_000_000;

    public static void main(String[] args) {
        int half = SIZE / 2;
        float[] arr = new float[SIZE];
        MassiveWork massiveWork = new MassiveWork();

        Arrays.fill(arr, 1f);
        long a = System.currentTimeMillis();
        System.arraycopy(massiveWork.calculateOneThread(arr), 0, arr, 0, arr.length);
        System.out.println("Время работы в одном потоке " + (System.currentTimeMillis() - a));

        Arrays.fill(arr, 1f);
        long b = System.currentTimeMillis();
        System.arraycopy(massiveWork.calculateMulThread(arr, half), 0, arr, 0, arr.length);
        System.out.println("Время работы в двух потоках " + (System.currentTimeMillis() - b));
    }
}
