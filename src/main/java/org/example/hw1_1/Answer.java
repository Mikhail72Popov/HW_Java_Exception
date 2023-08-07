package org.example.hw1_1;
class Answer {
    public static void arrayOutOfBoundsException() {
        // Напишите свое решение ниже
        // Ошибка, связанная с выходом за пределы массива
        int[] array = new int[10];
        array[11] = 2;
        System.out.println(array);
    }

    public static void divisionByZero() {
        // Напишите свое решение ниже
        // Деление на 0
        int a1 = 2;
        int a2 = 0;
        System.out.println(a1/a2);
    }

    public static void numberFormatException() {
        // Напишите свое решение ниже
        // Ошибка преобразования строки в число
        String a1 = "Hello";
        int a2 = Integer.parseInt(a1.trim());
        System.out.println("int a2 = " + a2);
    }
}

