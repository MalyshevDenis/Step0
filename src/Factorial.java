import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введите число");
        int n = in.nextInt();//вводим число,факториал которого нужно найти


        int y = n;
        for (int i = 1; i < n; i++) {
            y = y * i;
        }

        System.out.println("результат " + "!" + n + "=" + y);
    }


}
