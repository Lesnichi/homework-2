package com.vl.homework2;

import java.util.Scanner;

/**
 * Написать программу, отображающую статистику по осадкам
 * за N дней. N вводится пользователем.
 *     Пользователь также должен ввести N целых чисел, обозначающих
 * величину осадков в день.
 *     Программа должна выводить:
 * a. Количество дней
 * b. Сумму осадков за этот период
 * c. Среднее количество осадков за этот период
 * d. Максимальное количество дневных осадков за этот период
 *     Не использовать массивы!
 */
public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество дней: ");
        int numberOfDays = scanner.nextInt();

        int sumOfPrecipitation = 0;
        int average = 0;
        int maxPrecipitationOfDay = 0;

        for (int i = 1; i <= numberOfDays; i++) {
            System.out.print("Введите количество осадков за " + i + "-ый" + " день: ");
            int precipitationPerDay = scanner.nextInt();
            sumOfPrecipitation += precipitationPerDay;
            average = sumOfPrecipitation / i;
            if (precipitationPerDay > maxPrecipitationOfDay) {
                maxPrecipitationOfDay = precipitationPerDay;
            }
        }
        System.out.println("Сумма осадков за период: " + sumOfPrecipitation);
        System.out.println("Среднее количество осадков за период: " + average);
        System.out.println("Максимальное количество дневных осадков за период: " + maxPrecipitationOfDay);
    }
}
