import java.util.Scanner;

public class UnicElementsOfArray {

    public static void main(String[] args) {

        int arrayOfNumbers[] = new int[10];
        System.out.println("введите элементы массива");
        for (int i = 0; i < 10; i++) {
            Scanner in = new Scanner(System.in);
            arrayOfNumbers[i] = in.nextInt();

        }

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            int count = 0;
            for (int j = i + 1; j < arrayOfNumbers.length; j++) {
                if (arrayOfNumbers[i] == arrayOfNumbers[j] && (i != j)) {
                        count ++;
                }

            }
            if(count == 0){
                System.out.println("уникальные элементы массива : " + arrayOfNumbers[i]);
            }
        }

    }
}
