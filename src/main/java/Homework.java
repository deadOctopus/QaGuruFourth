import java.sql.SQLOutput;

public class Homework {
    public static void main(String[] args){

        // математические и логические операторы
        int a = 10;
        int b = 25;
        boolean result;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a / b);
        System.out.println(a * b);
        System.out.println(a % b);
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(b--);
        System.out.println(--b);

        result = (a + b) > (b - a);
        result = (a + b) < (b - a);
        result = (a + b) >= (b - a);
        result = (a + b) <= (b - a);
        result = (a + b) == (b - a);
        result = (a + b) != (b - a);
        result = (a > b) && (b == a);
        result = (a > b) || (b == a);



        // переполнение
        byte c = 126;
        short t = 0;
        long f = 102157887787L;

        c +=  100;
        System.out.println(c);

        t -= 32769;
        System.out.println(t);

        // остальные типы
        float j = 0.9F;
        double d = 4.45;
        char p = 'q';

    }
}
