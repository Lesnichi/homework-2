package com.vl.homework2;

import java.util.Scanner;

/**
 * Написать программу, вычисляющую и отображающую все числа
 * Фибоначчи меньше введённого пользователем целого числа.
 *     Решить двумя способами: с помощью цикла и с помощью
 * рекурсии.
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число:  ");
        int value = scanner.nextInt();
        System.out.println("C помощью цикла");
        printFibonacciWithFor(value);
        System.out.println();
        System.out.println("C помощью рекурсии");
        for (int i = 0; fibonacci(i) < value; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static void printFibonacciWithFor(int value) {
        int temp1 = 0;
        int temp2 = 1;
        int sum = temp1 + temp2;
        System.out.print(temp1 + " " + temp2);
        for (int i = 0; sum < value; i++) {
            sum = temp1 + temp2;
            if (sum < value) {
                System.out.print(" " + sum);
            }
            temp1 = temp2;
            temp2 = sum;
        }
    }

    public static int fibonacci(int value) {
        if (value == 0) {
            return 0;
        }
        if (value == 1) {
            return 1;
        } else {
            return fibonacci(value - 1) + fibonacci(value - 2);
        }
    }
}


