import java.util.Scanner;

public class RandomNumbers {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //   System.out.println("угадать число");

        int a = 10;
        int number = (int) (Math.random() * a);

        while (true) {
            System.out.println("угадать число от 0 до " + a);
            int inputNumber = in.nextInt();

            if (inputNumber == number) {
                System.out.println("вы угадали");
                break;
            } else if (inputNumber > number) {
                System.out.println("загаданное число меньше");
            } else {
                System.out.println("загаданное число больше");
            }
        }

    }


}






