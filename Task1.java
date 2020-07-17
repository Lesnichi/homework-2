package com.vl.homework2;

import java.util.Scanner;

/**
 * Написать программу, вычисляющую сумму цифр введённого
 * пользователем целого числа.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число:  ");
        int value = scanner.nextInt();
        System.out.println("Сумма цифр введенного числа: " + findSumOfDigitsOfNumber(value));
    }

    public static int findSumOfDigitsOfNumber(int value) {

        int counter = 0;
        int temp1 = value;
        if (value < 0) {
            temp1 *= -1;
        }
        for (int i = 1; temp1 >= 9; i++) {
            temp1 /= 10;
            counter += 1;
        }

        int result = 0;
        int temp2 = value;
        if (value < 0) {
            temp2 *= -1;
        }
        for (int i = 0; i <= counter; i++) {
            result += temp2 % 10;
            temp2 /= 10;
        }
        return result;
    }
}
