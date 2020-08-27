import java.util.Scanner;

public class SummaElementovMassiva {
    public static void main(String[] args) {

        int array[] = new int[5];
        Scanner in = new Scanner(System.in);
        System.out.println("введите элементы массива");
        for (int i = 0; i < 5; i++) {
            array[i] = in.nextInt();
        }
        int summa = 0;
        for (int i = 0; i < array.length; i++) {
            summa += array[i];
        }
        System.out.println("сумма элементов массива = " + summa);
    }


}
