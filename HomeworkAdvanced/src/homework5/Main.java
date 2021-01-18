package homework5;

import java.util.Arrays;

public class Main {
    static final int SIZE = 10_000_000;
    static final int HALF = SIZE / 2;
    static final float[] arr = new float[SIZE];

    public static void main(String[] args) {

        Arrays.fill(arr, 1f);
        MassiveWork massiveWork = new MassiveWork();

        long a = System.currentTimeMillis();
        massiveWork.calculate(arr);
        System.out.println("Время работы в одном потоке " + (System.currentTimeMillis() - a));

        Arrays.fill(arr, 1f);
        massiveWork.calculateMulThread(arr, HALF);
    }
}
