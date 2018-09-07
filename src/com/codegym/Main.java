package com.codegym;

public class Main {

    public static void main(String[] args) {
        double num1 = 50;
        double num2 = 90;
        double num3 = 10;

        double[] res = sortedNumbers(num1, num2, num3);

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }

    }

    public static double[] sortedNumbers(double num1, double num2, double num3) {
        double[] arr = {num1, num2, num3};
        double temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
