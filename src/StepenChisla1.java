import java.util.Scanner;

public class StepenChisla1 {
    public static void main(String[] args) {//найти степень числа

        Scanner in = new Scanner(System.in);
        System.out.println("введите число");
        int a = in.nextInt();
        System.out.println("введите степень числа");
        int b = in.nextInt();
        int c = a;
        for (int i = 0; i < b - 1 ;  i++) {
            a = a * c;
        }
        System.out.println("результат = " + a);
    }



}
