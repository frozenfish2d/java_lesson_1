package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Task 1
        int arrayRandom[] = new int[50];
        for (int i = 0; i < arrayRandom.length; i++) {
            arrayRandom[i] = (int) (Math.random() * 500);
        }
        System.out.println(Arrays.toString(arrayRandom));
        int max = arrayRandom[0];
        int min = arrayRandom[0];
        int sum = 0;
        for (int item : arrayRandom) {
            if (max < item) {
                max = item;
            }
            if (min > item) {
                min = item;
            }
            sum += item;
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + sum / arrayRandom.length);

        System.out.println("------------");
        // Task 2
        int n = 2;
        int k = 2;
        int result = 0;
        for (int i = 1; i <= n; i++) {
            int value = i;
            for (int j = 0; j < k - 1; j++) {
                value *= value;
            }

            result += value;
        }

        System.out.println("sum = " + result);

        System.out.println("------------");
        // Task 3
        for (int i = 0; i < arrayRandom.length; i++) {
            arrayRandom[i] = (int) (Math.random() * 500);
        }
        for (int i = 0; i < arrayRandom.length; i++) {
            for (int j = 0; j < arrayRandom.length - 1; j++) {
                if (arrayRandom[j] > arrayRandom[j + 1]) {
                    int temp = arrayRandom[j];
                    arrayRandom[j] = arrayRandom[j + 1];
                    arrayRandom[j + 1] = temp;
                }
            }
        }


        System.out.println(Arrays.toString(arrayRandom));


        System.out.println("------------");
        // Task 4
        for (int i = 1; i < 100; i += 2) {
            boolean isSimple = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isSimple = false;
                    break;
                }
            }

            if (isSimple) {
                System.out.println(i);
            }
        }
        System.out.println("------------");
        // Task 5
        int t = 10, t1 = 0, t2 = 1;
        System.out.print("First " + t + " terms: ");
        for (int i = 1; i <= t; ++i) {
            System.out.println(t1);
            int summ = t1 + t2;
            t1 = t2;
            t2 = summ;
        }
        System.out.println("------------");
        // Task 6
        int test_array[] = {0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println(Arrays.toString(removeElement(test_array, 2)));

        System.out.println("------------");
        // Task 7
        int arr[] = {9, 4, 9, 6, 7, 4};
        for (int i = 0; i < arr.length; i++) {
            int j;
            for (j = 0; j < arr.length; j++)
                if (i != j && arr[i] == arr[j])
                    break;
            if (j == arr.length) {
                System.out.println(arr[i]);
            }
        }

        System.out.println("------------");
        // Task 8
        int array[]= {1,5,3,7,9,3,8,0,8,3};

        for(int i=0; i<array.length;i++){
            int count=0;
            for(int j=0;j<array.length;j++){
                if (array[i]==array[j]){
                    count++;
                }
            }
            System.out.println(count);
        }

    }

    public static int[] removeElement(int[] nums, int val) {
        int offset = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                offset++;
            } else {
                nums[i - offset] = nums[i];
            }
        }
        // Arrays.copyOf копирует значение из массива nums в новый массив
        // с длинной nums.length - offset
        return Arrays.copyOf(nums, nums.length - offset);
    }
}
