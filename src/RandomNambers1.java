import java.util.Scanner;

public class RandomNambers1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("угадать число с семи попыток");
        int inputNumber = in.nextInt();
        int a = 10;
        int number = (int) (Math.random() * a);

        for (int i = 7; i > 0; --i) {


            if (inputNumber > number) {
                System.out.println("загаданное число меньше.Осталось попыток " + i);
                //     Scanner in1 = new Scanner(System.in);
                //    int inputNumber1 = in.nextInt();

            } else if (inputNumber < number) {
                System.out.println("загаданное число больше.Осталось попыток " + i);
                //     Scanner in2 = new Scanner(System.in);
                //  int inputNumber2 = in.nextInt();

            } else if (inputNumber == number) {
                System.out.println("вы угадали");
                break;
            }
        }
    }
}



