package IgorPrasolov.basic.strings;

import java.util.Scanner;

public class AlternateCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().toLowerCase();
        char[] arr = s.toCharArray();
        char[] arr2 = new char[arr.length];
        int count = 0;

        for (int i = 0; i < arr.length; i ++) {
            if (i % 2 == 0) {
                arr2[count] = Character.toUpperCase(arr[i]);
                count++;
                continue;
            }
            arr2[count] = arr[i];
            count++;
        }
        System.out.println(arr2);
    }
}
