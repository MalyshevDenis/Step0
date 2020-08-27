import java.util.Scanner;

public class PovtorElemMassiva {
    public static void main(String[] args) {

        int array[] = new int[10];
        System.out.println("введите количество элементов массива");
        Scanner in = new Scanner(System.in);
        int quantyty = in.nextInt();

        System.out.println("введите элементы массива");

        for (int i = 0; i < quantyty; i++) {
            array[i] = in.nextInt();
        }
        for (int i = 0; i < quantyty ; i++) {
            for (int j = 0; j < quantyty; j++) {
                if(array[i] == array[j] && i != j){
                    System.out.println("повторяющиеся элементы массива - " + array[j]);
                }
            }
        }
    }
}
