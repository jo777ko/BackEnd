package de.telran.geork.homeworks.hw13;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 2, 7, 3, 2, 3, 2};
        int k = 2;
        System.out.println(findAmountOfElement(arr, k));
    }

    private static int findAmountOfElement(int[] arr, int k) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k){
                count++;
            }
        }
        return count;
    }
}
