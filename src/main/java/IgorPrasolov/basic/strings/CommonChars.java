package IgorPrasolov.basic.strings;

import java.util.Scanner;

public class CommonChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine().toLowerCase();
        String s2 = scanner.nextLine().toLowerCase();
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        for (int i = 0; i < arr1.length; i++) {
            int countArr1 = 0;
            for (int j = 0; j < i; j++) {
                if (arr1[i] == arr1[j]) {
                    countArr1++;
                }
            }
            if (countArr1 > 0) {
                continue;
            }

            for (int k = 0; k < arr2.length; k++) {
                if (arr1[i] == arr2[k]) {
                    System.out.println(arr1[i]);
                    break;
                }
            }
        }
    }
}
