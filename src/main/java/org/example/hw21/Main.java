package org.example.hw21;
import java.util.Scanner;
/*
Задача 1:
Напишите программу, которая запрашивает у пользователя число и проверяет,
является ли оно положительным. Если число отрицательное или равно нулю,
программа должна выбрасывать исключение InvalidNumberException с сообщением
"Некорректное число". В противном случае программа должна выводить сообщение
"Число корректно".
 */

public class Main {
    public static void main(String[] args) throws InvalidNumberException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите положительное число: ");
        int a = scanner.nextInt();
        if (a <= 0) {throw new InvalidNumberException("Некорректное число");}
        System.out.println("Число корректно: " + a);
        }
}
