package org.example.hw3_2;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;



public class FileManager {
    /**
     * Создание нового файла в текущем каталоге
     */
    public static boolean creatingFile() {
        try {
            File file = new File("file.txt");
            if (file.createNewFile()) {
                System.out.println("file.txt файл создан");
            } else System.out.println("file.txt файл уже существует");
        } catch (IOException e) {
            System.out.println();
        }
        return false;
    }


    /**
     * Запись(перезапись) в файл, если файл не существует, то будет создан.
     */
    public static void writingFile() {
        try {
            BufferedWriter writer = Files.newBufferedWriter(Paths.get("file.txt"));
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Hello world");
            bufferedWriter.newLine();
            bufferedWriter.write("Еще Hello world"); // вторя стрка
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл");
            e.printStackTrace();
        }
    }


    /**
     * Чтение файла
     */
    public static void readingFile() {
        try (BufferedReader in = Files.newBufferedReader(Paths.get("file.txt"));) {
            in.lines().forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Копирование файла с использованием потоков
     * @return
     */
    public static void copyingFile() {
        try (FileInputStream inputStream = new FileInputStream("file.txt")){
            File directory = new File("src/folder");
            if (!directory.exists()) directory.mkdir(); // проверка папки, если нет, создаём
            try (FileOutputStream outputStream = new FileOutputStream("src/folder/file.txt")){
                byte[] bytes = new byte[inputStream.available()];
                int length;
                while ((length = inputStream.read(bytes)) != -1){ // передаем данные в новый файл через цикл
                    outputStream.write(bytes, 0, length);
                }
            }catch (IOException ex) {
                System.out.println("Ошибка вывода");
            }
        } catch (IOException e) {
            System.out.println("Ошибка ввода");
        }
    }

    /**
     * Удаление файла
     */
    public static void deleteFile() {
        File file = new File("src/folder/file.txt");
        if (file.delete()) {
            System.out.println("Файл удален");
        } else {
            System.out.println("Файл не найден");
        }
    }
}


