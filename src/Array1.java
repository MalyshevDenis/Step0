import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {


        int arreyOFNumbers[] = new int[5];
        System.out.println("ввод элементов массива");
        for (int i = 0; i < 5; i++) {
            Scanner in = new Scanner(System.in);
            arreyOFNumbers[i] = in.nextInt();
        }
        int maxIndex = 0;
        int maxValue = arreyOFNumbers[0];
        for (int i = 0; i < 5; i++) {
            if (arreyOFNumbers[i] > maxValue) {
                maxValue = arreyOFNumbers[i];
                maxIndex = i;
                System.out.println("максимальное значение " + maxValue);
            }

        }
        int minIndex = 0;
        int minValue = arreyOFNumbers[0];
        for (int i = 0; i < 5; i++) {
            if (arreyOFNumbers[i] < minValue) {
                minValue = arreyOFNumbers[i];
                minIndex = i;
                System.out.println("минимальное значение " + minValue);
            }

        }

        int tempData = arreyOFNumbers[minIndex];
        arreyOFNumbers[minIndex] = arreyOFNumbers[maxIndex];
        arreyOFNumbers[maxIndex] = tempData;
        for (int i = 0; i < 5; i++) {
            System.out.println(arreyOFNumbers[i]);
        }
    }


}
