package org.example.hw22;

import java.util.Scanner;

/*
Задача 2:
Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление.
Если второе число равно нулю, программа должна выбрасывать исключение DivisionByZeroException с сообщением
"Деление на ноль недопустимо". В противном случае программа должна выводить результат деления.

Обратите внимание, что в обеих задачах используются собственные исключения, которые наследуются от класса Exception.
Это позволяет нам определить специфическую причину ошибки и передать информацию об ошибке для последующей обработки.
 */
public class Main {
    public static void main(String[] args) throws DivisionByZeroException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        double b = scanner.nextInt();
        if (b == 0) {throw new DivisionByZeroException("Деление на ноль недопустимо");}
        System.out.println("a / b = " + a/b);
    }
}

