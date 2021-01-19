package homework5;

public class MassiveWork {

    private float[] calculate(float[] arr, int half) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + (i + half) / 5.) * Math.cos(0.2f + (i + half) / 5.) *
                    Math.cos(0.4f + (i + half) / 2.));
        }
        return arr;
    }

    protected float[] calculateOneThread(float[] arr) {
        System.arraycopy(calculate(arr, 0), 0, arr, 0, arr.length);
        return arr;
    }

    protected float[] calculateMulThread(float[] arr, int half) {
        float[] arr1 = new float[half];
        float[] arr2 = new float[half];

        System.arraycopy(arr, 0, arr1, 0, half);
        System.arraycopy(arr, half, arr2, 0, half);

        Thread t1 = new Thread(() -> System.arraycopy(calculate(arr1, 0), 0, arr1, 0, arr1.length));
        Thread t2 = new Thread(() -> System.arraycopy(calculate(arr2, half), 0, arr2, 0, arr2.length));

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.printf("Что-то не так в одном из потоков %s%n", e.getMessage());
        }

        System.arraycopy(arr1, 0, arr, 0, half);
        System.arraycopy(arr2, 0, arr, half, half);
        return arr;
    }
}
