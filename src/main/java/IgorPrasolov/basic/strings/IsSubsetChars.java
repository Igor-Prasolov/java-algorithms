package IgorPrasolov.basic.strings;

import java.util.Scanner;

public class IsSubsetChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine().toLowerCase();
        String s2 = scanner.nextLine().toLowerCase();
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        if (arr2.length > arr1.length) {
            System.out.println("Вторая строка больше");
            return;
        }
        for (int i = 0; i < arr2.length; i++) {
            int countArr2 = 0;
            for (int j = 0; j < i; j++) {
                if (arr2[i] == arr2[j]) {
                    countArr2++;
                }
            }
            if (countArr2 > 0) {
                continue;
            }

            countArr2 = 0;

            for (int k = 0; k < arr2.length; k++) {
                if (arr2[i] == arr2[k]) {
                    countArr2++;
                }
            }
            System.out.println("arr2:" + countArr2);

            int countArr1 = 0;
            for (int m = 0; m < arr1.length; m++) {
                if (arr2[i] == arr1[m]) {
                    countArr1++;
                }
            }
            System.out.println("arr1:" + countArr1 + " ");
            if (countArr2 > countArr1) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);

    }

}
