package homework2;

public class MyArrayDataException extends Exception{
    public MyArrayDataException(int row, int column, String data) {
        super(String.format("В ячейке [%d, %d] неверные данные - %s. В\n" +
                "ячейке лежит символ или текст вместо числа", row, column, data));
    }
}
