package task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int nb = sc.nextInt();
            Integer number = nb;

            // Бинарный форма
            String convert = Integer.toBinaryString(number);
            System.out.println(convert + " = Бинарная");

            // Восьмиричная форма
            convert = Integer.toOctalString(number);
            System.out.println(convert + " = Восьмиричная");

            // Шеснадцатиричная форма
            convert = Integer.toHexString(number).toUpperCase();
            System.out.println(convert + " = Шеснадцатиричная");
        } catch (InputMismatchException e) {
            System.out.println("usage");
        }
    }
}


