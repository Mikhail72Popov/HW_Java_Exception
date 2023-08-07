package org.example.hw2_1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
и возвращает введенное значение. Ввод текста вместо числа не должно приводить к
падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */
public class Main {
    public static void main(String[] args) {
            boolean fractional = true;
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            while(fractional){
                System.out.print("Введите дробное число: ");
                try{
                    float тumber = Float.parseFloat(reader.readLine());
                    System.out.printf("Число равно %f", тumber);
                    fractional = false;
                }
                catch (IOException|NumberFormatException e) {
                    System.out.println("Ввод неверный, введите дробное число");
                }
            }
    }
}

