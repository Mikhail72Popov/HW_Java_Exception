package org.example.hw2_4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
 Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */
public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите текст ");
        try {
            String result = reader.readLine();
            if (result.equals("")) throw new RuntimeException("Введена пустая строка, введите текст");
            System.out.println(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


