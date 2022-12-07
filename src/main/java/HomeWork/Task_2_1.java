package HomeWork;
/*
Задание 1
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
и возвращает введенное значение.
Ввод текста вместо числа не должно приводить к падению приложения, вместо этого,
необходимо повторно запросить у пользователя ввод данных.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_2_1 {
    public static void main (String[] args) {
        boolean digit = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in ));

        while (digit) {
            System.out.print("Введите дробное число: ");
            try{
                float decimal = Float.parseFloat(reader.readLine());
                System.out.printf("Введенное число равно %f\n", decimal);
                digit = false;
            } catch (IOException | NumberFormatException e) {
                System.out.println("Неверный ввод. Введите дробное число!!!");
            }

        }
    }
}
