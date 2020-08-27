import java.util.Scanner;

public class Factorial2 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("введите число");
        int val = in.nextInt();


        int copyVal = val - 1;

        while(copyVal > 1){
            val = val* copyVal;
            copyVal --;
        }
        System.out.println("результат " + val);
    }

}
