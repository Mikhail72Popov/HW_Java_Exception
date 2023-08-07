package org.example.hw3_2;
import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

import static org.example.hw3_2.FileManager.*;

/*
Задача 2: Файловый менеджер (ООП, исключения)

Создайте класс FileManager. Этот класс должен иметь методы для выполнения основных операций с файлами:
 чтение, запись и копирование.
  Каждый из этих методов должен выбрасывать соответствующее исключение, если в процессе выполнения операции произошла
  ошибка (например, FileNotFoundException, если файл не найден).
 */
public class Main {
        public static void main(String[] args) {
            System.out.println("Данная программа может:\n" +
                    "1 - создать файл;\n" +
                    "2 - сделать запись в файл;\n" +
                    "3 - произвести чтение файла;\n" +
                    "4 - копировать файл;\n" +
                    "5 - удалить файл.\n" +
                    "Сделайте ваш выбор, введите соответствующею цифру:\n ");
            Scanner sc = new Scanner(System.in);
            try {
                switch (sc.nextInt()) {
                    case 1:
                        creatingFile();
                        break;
                    case 2:
                        writingFile();
                        break;
                    case 3:
                        readingFile();
                        break;
                    case 4:
                        copyingFile();
                        break;
                    case 5:
                        deleteFile();
                        break;
                    default:
                        System.out.println("Ввод не соответствует требованию !");
                }
            }catch (InputMismatchException e) {
                System.out.println("Ошибка, необходимо вводить только цифры 1,2,3,4,5,6!");
            }
        }
}
