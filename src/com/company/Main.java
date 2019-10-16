package com.company;

public class Main {

    public static void main(String[] args) {
        //Task 1
        int arrayRandom[] = new int[100];
        for (int i = 0; i < arrayRandom.length; i++) {
            arrayRandom[i] = (int) (Math.random() * 100);
            System.out.print(arrayRandom[i] + " ");
        }
        System.out.println();
        int max = arrayRandom[0];
        int min = arrayRandom[0];
        int avarage = 0;
        for (int i = 0; i < arrayRandom.length; i++) {
            if (max < arrayRandom[i]) {
                max = arrayRandom[i];
            }
            if (min > arrayRandom[i]) {
                min = arrayRandom[i];
            }
            avarage += arrayRandom[i] / arrayRandom.length;
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + avarage);
    }
}
