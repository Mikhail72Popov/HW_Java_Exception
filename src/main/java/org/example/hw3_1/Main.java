package org.example.hw3_1;

import java.util.Scanner;

import static org.example.hw3_1.PasswordVerifier.validPassword;

/*
Задача 1: Проверка пароля (Основы языка Java, операторы, ветвления)

Создайте класс PasswordVerifier. Этот класс должен содержать метод, который принимает строку пароля и проверяет его на
 соответствие следующим правилам:

Пароль должен быть не менее 8 символов.
Пароль должен содержать хотя бы одну цифру.
Пароль должен содержать хотя бы одну заглавную букву.
Метод должен выбрасывать исключение, если пароль не соответствует какому-либо из этих правил.
 */
public class Main {
    public static void main(String[] args) throws LengthDoesNotMatch {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пароль: ");
        String passw = scanner.nextLine();
        if (validPassword(passw)){
            System.out.print("Пароль принят");
        }
        else {
            System.out.print("Пароль не принят, придумайте новый пароль");
        }
    }
}
