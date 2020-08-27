import java.util.Scanner;

public class ReverseOfArray {
    public static void main(String[] args) {
        int arrayOfNumbers[] = new int[10];
        System.out.println("введите элементы массива");
        for (int i = 0; i < 10; i++) {
            Scanner in = new Scanner(System.in);
            arrayOfNumbers[i] = in.nextInt();
        }
        System.out.println("массив после реверса : ");
        for (int i = 10 - 1; i >= 0; i--) {

                System.out.println(arrayOfNumbers[i]);
        }
    }

}
