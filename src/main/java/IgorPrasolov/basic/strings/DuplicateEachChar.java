package IgorPrasolov.basic.strings;

import java.util.Scanner;

public class DuplicateEachChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().toLowerCase();
        char[] arr = s.toCharArray();
        char[] arr2 = new char[arr.length * 2];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            arr2[count] = arr[i];
            count++;
            arr2[count] = arr[i];
            count++;
        }
        System.out.println(arr2);
    }
}
