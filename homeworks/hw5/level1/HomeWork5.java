package de.telran.geork.homeworks.hw5.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class HomeWork5 {

    public static void main(String[] args) {

        Random random = new Random();

        System.out.println("Task1");
        System.out.println(result(11));

        System.out.println("Task2");
        int[][] arr = new int[10][10];
        fillWithRandom(arr);
        System.out.println(Arrays.deepToString(arr));
        twoDemPrint(arr);

        System.out.println("Task3");
        int[][] arr3 = new int[8][8];
        fillWithRandom(arr3);
        twoDemPrint(arr3);
        int[] arrRevDia = remakeOneDim(arr3);
        System.out.println(Arrays.toString(arrRevDia));
        System.out.println(getMax(arrRevDia));

        System.out.println("Task4");
        int[][] arr4 = new int[8][8];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                arr4[i][j] = (3 * i) - (7 * j);
            }
        }
        twoDemPrint(arr4);

        System.out.println("Task5");
        String arr5[][] = new String[8][8];
        printCheeseBoard(arr5);

        System.out.println("Task6");
        System.out.println(getNegativeNumbersUnderHeadDiagonal(arr4));

        System.out.println("Task7");
        System.out.println(getMaxEvenElement(arr3));


    }
    public static int result(int number){
        return number + 5;
    }

    public static void fillWithRandom(int[][] array){
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(100);
            }
        }
    }
    public static void twoDemPrint(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= arr[i].length; j++) {
                if (j == arr[i].length){
                    System.out.println();
                } else {
                    System.out.print(arr[i][j] + ", ");
                }
            }
        }
    }

    public static void printCheeseBoard(String[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((i + j)% 2 == 0)  {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
                if (j == arr[i].length - 1) {
                    System.out.println();
                }
            }
        }
    }

    public static int[] remakeOneDim(int[][] array){
        int[] reverseDiagonal = new int[array.length];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((i + j) < array.length){
                    sum = array[i][j];
                }
            }
            reverseDiagonal[i] = sum;
        }
        return reverseDiagonal;
    }

    public static int getMax(int[] array){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    public static int getNegativeNumbersUnderHeadDiagonal(int[][] array){
        List<Integer> list = new ArrayList<>();
        int num;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i > j && (array[i][j] < 0)){
                        num = array[i][j];
                        list.add(num);
                }
            }
        }

        return list.size();
    }

    public static int getMaxEvenElement(int[][] array){
        List<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int num;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((i+j)% 2 == 0){
                    num = array[i][j];
                    if (max < num){
                        max = num;
                    }
                }
            }
        } return max;
    }

}
