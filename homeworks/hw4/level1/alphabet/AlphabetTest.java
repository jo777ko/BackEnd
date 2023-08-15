package de.telran.geork.homeworks.hw4.level1.alphabet;

public class AlphabetTest {
    public static void main(String[] args) {

        String[] value = {"K", "O", "Z"};
        Alphabet[] arr = Alphabet.values();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < value.length; j++){
                if (value[j].equals(String.valueOf(arr[i]))) {
                    System.out.println(arr[i].ordinal());
                }
            }
        }
    }
}
