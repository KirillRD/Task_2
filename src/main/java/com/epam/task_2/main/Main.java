package com.epam.task_2.main;

import java.util.Scanner;

public class Main {
    public static int inputIntFromConsole (String str) {
        int value;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input " + str + ": ");
        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.println("Wrong input. The " + str + " must be an integer. Please, try again.");
            System.out.print("Input " + str + ": ");
        }
        value = sc.nextInt();
        return value;
    }

    public static boolean isNatural (String str, int value) {
        if (value <= 0) {
            System.out.println("Wrong input. The " + str + " must be a natural. Please, try again.");
            return false;
        } else {
            return true;
        }
    }

    public static boolean isBigger (int value1, int value2, String str) {
        if (value1 > value2) {
            System.out.println(str);
            return true;
        } else {
            return false;
        }
    }

    public static void inputOneDimensionalArray (int[] mas, String str) {
        for (int i = 0; i < mas.length; i++) {
            mas[i] = inputIntFromConsole((i+1) + str);
        }
    }

    public static void outputOneDimensionalArray (int[] mas) {
        System.out.print("Array: ");
        for (int i : mas) {
            System.out.print("[" + i + "] ");
        }
    }

    public static int[] unionArrays (int[] mas1, int[] mas2, int k) {
        if (mas1 == null || mas2 == null || mas1.length == 0 || mas2.length == 0 || k <= 0 || k > mas1.length) {
            return null;
        }
        int[] mas = new int[mas1.length + mas2.length];

        for (int i = 0; i < (mas1.length + mas2.length); i++) {
            if (i <= (k - 1)) {
                mas[i] = mas1[i];
            } else if (i <= (k + mas2.length - 1)) {
                mas[i] = mas2[i - k];
            } else {
                mas[i] = mas1[i - mas2.length];
            }
        }
        return mas;
    }

    public static void main(String[] args) {
        int lengthOfMas1, lengthOfMas2, k;

        do {
            lengthOfMas1 = inputIntFromConsole("length of the first array");
        } while (!isNatural("length of the first array", lengthOfMas1));

        do {
            lengthOfMas2 = inputIntFromConsole("length of the second array");
        } while (!isNatural("length of the second array", lengthOfMas2));

        do {
            k = inputIntFromConsole("number of position in the first array");
        } while (!isNatural("number of position in the first array", k) || isBigger(k, lengthOfMas1, "Wrong input. The number of position in the first array must be equal to or less than length of the first array. Please, try again."));

        int[] mas1 = new int[lengthOfMas1];

        inputOneDimensionalArray(mas1, " element of the first array");

        int[] mas2 = new int[lengthOfMas2];

        inputOneDimensionalArray(mas2, " element of the second array");

        int[] mas = unionArrays(mas1, mas2, k);

        outputOneDimensionalArray(mas);
    }
}