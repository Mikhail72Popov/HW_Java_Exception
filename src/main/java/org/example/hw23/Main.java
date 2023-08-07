package org.example.hw23;

/*
Задача3: - по желанию
Напишите программу, которая запрашивает у пользователя три числа и выполняет следующие проверки:

Если первое число больше 100, выбросить исключение NumberOutOfRangeException с сообщением
"Первое число вне допустимого диапазона".

Если второе число меньше 0, выбросить исключение NumberOutOfRangeException с сообщением
"Второе число вне допустимого диапазона".

Если сумма первого и второго чисел меньше 10, выбросить исключение NumberSumException с сообщением
"Сумма первого и второго чисел слишком мала".

Если третье число равно 0, выбросить исключение DivisionByZeroException с сообщением "Деление на ноль недопустимо".
В противном случае программа должна выводить сообщение "Проверка пройдена успешно".
- необходимо создать 3 класса собвстенных исключений
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
            throws DivisionByZeroException, NumberSumException, NumberOutOfRangeException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        double b = scanner.nextInt();
        System.out.println("Введите третье число: ");
        double c = scanner.nextInt();
        if (a > 100) {throw new NumberOutOfRangeException("Первое число вне допустимого диапазона >100");}

        if (b < 0) {throw new NumberOutOfRangeException("Второе число вне допустимого диапазона <0");}


        if (b + a < 10) {throw new NumberSumException("Сумма первого и второго чисел слишком мала <10");}
        double d = a + b;
        System.out.println("a + b = " + d);

        if (c == 0) {throw new DivisionByZeroException("Деление на ноль недопустимо");}
        System.out.println("(a + b)/c = " + (a+b)/c);
    }
}
