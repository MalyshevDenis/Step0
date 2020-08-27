import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpisokZadach {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Scanner inline = new Scanner(System.in);
        List<String> zadachi = new ArrayList<String>();

        while (true) {
            System.out.println("выбирите действие");
            String action = inline.nextLine();

            switch (action) {

                case "add": {
                    System.out.println("введите задачу");
                    String zadacha = inline.nextLine();
                    zadachi.add(zadacha);
                    break;
                }
                case "edit": {
                    System.out.println("введите id элемента");
                    int id = in.nextInt();
                    id = id - 1;
                    if(zadachi.get(id) == null){
                        System.out.println("ошибка");
                        break;
                    }
                }
                case "delete" : {
                    System.out.println("введите id элемента");
                     int id = in.nextInt();
                     id = id - 1;
                     zadachi.remove(id);
                    System.out.println("удаление выполнено");
                    break;
                }
                case "list" : {
                    int id1 = 1;
                 for(String zadacha : zadachi){
                     System.out.println(zadacha + "-" + id1);
                     id1++;
                 }
                 break;
                }


            }
        }


    }


}
