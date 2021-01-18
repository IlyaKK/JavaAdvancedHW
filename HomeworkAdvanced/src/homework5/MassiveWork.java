package homework5;

public class MassiveWork {

    protected float[] calculate(float[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (float) (arr1[i] * Math.sin(0.2f + i / 5.) * Math.cos(0.2f + i / 5.) *
                    Math.cos(0.4f + i / 2.));
        }
        return arr1;
    }

    private float[] calculateSecondHalf(float[] arr2, int half) {
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (float) (arr2[i] * Math.sin(0.2f + (i+half)  / 5.) * Math.cos(0.2f + (i+half) / 5.) *
                    Math.cos(0.4f + (i+half) / 2.));
        }
        return arr2;
    }

    protected void calculateMulThread(float[] arr, int half){
        float[] arr1 = new float[half];
        float[] arr2 = new float[half];
        long a = System.currentTimeMillis();
        System.arraycopy(arr, 0, arr1, 0, half);
        System.arraycopy(arr, half, arr2, 0, half);

        Thread t1 = new Thread(()-> System.arraycopy(calculate(arr1), 0, arr1, 0, arr1.length));

        Thread t2 = new Thread(()-> System.arraycopy(calculateSecondHalf(arr2, half), 0, arr2, 0, arr2.length));

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e){
            System.out.printf("Что-то не так в одном из потоков %s%n", e.getMessage());
        }

        System.arraycopy(arr1, 0, arr, 0, half);
        System.arraycopy(arr2, 0, arr, half, half);

        System.out.println("Время работы в двух потоках " + (System.currentTimeMillis() - a));
    }
}
