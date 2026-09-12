package IgorPrasolov.basic.strings;

import java.util.Scanner;

public class MergeArraysAlternating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine().toLowerCase();
        String s2 = scanner.nextLine().toLowerCase();
        if (s1.length() != s2.length()) {
            System.out.println(false);
            return;
        }

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        char[] arr3 = new char[arr1.length + arr2.length];
        int count = 0;

        for (int i = 0; i < arr1.length; i++) {
            arr3[count] = arr1[i];
            count++;
            arr3[count] = arr2[i];
            count++;
        }
        System.out.println(arr3);
    }
}
