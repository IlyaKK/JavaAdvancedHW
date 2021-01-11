package homework2;

import java.util.Arrays;

public class Main {
    public static final int SIZE = 4;
    public static void main(String[] args) {
        String[][] massive = new String[SIZE][SIZE];
        for(int i = 0; i < massive.length; i++){
            Arrays.fill(massive[i], String.valueOf(i));
        }
        //massive[0][0] = "Error";
        int sum = 0;
        try{
            sum = sumNumber(massive);
            System.out.println("Сумма элементов массива " + sum);
        }catch (MyArraySizeException | MyArrayDataException e){
            e.printStackTrace();
        }
    }

    private static int sumNumber(String[][] massive) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if(massive.length != SIZE || massive[0].length != SIZE){
            throw new MyArraySizeException(String.format("Размер массива не %dх%d", SIZE, SIZE));
        }

        for(int i = 0; i < massive.length; i++){
            for(int j = 0; j < massive[i].length; j++){
                try{
                    sum += Integer.parseInt(massive[i][j]);
                }catch (NumberFormatException e){
                    throw new MyArrayDataException(i, j, massive[i][j]);
                }
            }
        }
        return sum;
    }

}
