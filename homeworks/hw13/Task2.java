package de.telran.geork.homeworks.hw13;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
        int[] arr2 = {2, 1, 2};
        System.out.println(isArraysEquals(arr, arr2));
        System.out.println(isArraysEqualsV2(arr, arr2));
    }

    public static boolean isArraysEquals(int[] array, int[] array2){
        if (array.length != array2.length ){
            return false;
        } else {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array2.length; j++) {
                    if (array.length != array2.length ){

                    } if (array[i] == array2[j]){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static boolean isArraysEqualsV2(int[] array, int[] array2){
        if (array.length != array2.length){
            return false;
        } else {
            Arrays.sort(array);
            Arrays.sort(array2);
            for (int i = 0; i < array.length; i++) {
                if (array[i] == array2[i]){
                    return true;
                }
            }
        }
        return false;
    }

}
