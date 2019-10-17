package com.company;

public class Main {

    public static void main(String[] args) {
        // Task 1
        int arrayRandom[] = new int[500];
        for (int i = 0; i < arrayRandom.length; i++) {
            arrayRandom[i] = (int) (Math.random() * 1000);
            System.out.print(arrayRandom[i] + " ");
        }
        System.out.println();
        int max = arrayRandom[0];
        int min = arrayRandom[0];
        int sum = 0;
        for (int i = 0; i < arrayRandom.length; i++) {
            if (max < arrayRandom[i]) {
                max = arrayRandom[i];
            }
            if (min > arrayRandom[i]) {
                min = arrayRandom[i];
            }
            sum += arrayRandom[i];
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + sum/arrayRandom.length);

        // Task 2
        int n = 2;
        int k = 2;
        int result = 0;
        for(int i = 1; i <= n ; i++){
            int value = i;
            for(int j = 0; j < k - 1; j++){
                value *= value;
            }

            result += value;
        }

        System.out.println("sum = " + result);
    }



}
