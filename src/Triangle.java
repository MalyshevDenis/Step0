public class Triangle {
    public static void main(String[] args) {

        double a, b, c; // длины сторон
        double p;      //полупериметр
        double area;   //площадь треугольника
        double x,y;

        a = 25;
        b = 23;
        c = 28;


        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("треугольник существует");
        } else {
            System.out.println("треугольник не существует");
            return;
        }

        p = (a + b + c) / 2;
        area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("площадь треугольника = " + area);


    }

}


