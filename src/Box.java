import java.util.Scanner;

public class Box {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введите количество ящиков");
        long box = in.nextLong();
        System.out.println("введите количество ящиков в контейнере");
        long boxInConteiner = in.nextLong();
        System.out.println("введите количество контейнеров в машине");
        long conteinerInCar = in.nextLong();

        int countBox = 0;
        int countConteiner = 0;
        int countCar = 0;

        System.out.println("начинаем погрузку первого контейнера");
        for (int i = 0; i < box; i++) {

            if (i - countBox < boxInConteiner) {
                System.out.println("ящик №" + (i + 1));
            }else{
                countBox += boxInConteiner;
                countConteiner ++;
                if(countConteiner < conteinerInCar){
                    System.out.println("начинаем погрузку в контейнер" + (countConteiner + 1));
                }else{
                    countConteiner = 0;
                    countCar ++;
                    System.out.println("начинаем погрузку в грузовик №" + (countCar + 1));
                    System.out.println("начинаем погрузку в контейнер №" + (countConteiner + 1));
                }
            }
        }
    }


}
