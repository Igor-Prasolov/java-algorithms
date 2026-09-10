package IgorPrasolov.basic.strings;

import java.util.Scanner;

public class IsAnagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().toLowerCase();
        String s2 = scanner.nextLine().toLowerCase();
        char[] arr = s.toCharArray();
        char[] arr2 = s2.toCharArray();


        if (arr.length == arr2.length) {
            for (int i = 0; i < arr.length; i++) {
                int currentCountArr = 0;
                int currentCountArr2 = 0;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        currentCountArr++;
                    }
                }
                for (int k = 0; k < arr2.length; k++) {
                    if (arr[i] == arr2[k]) {
                        currentCountArr2++;
                    }
                }
                if (currentCountArr != currentCountArr2) {
                    System.out.println(false);
                    return;
                }
            }
            System.out.println(true);
            return;
        }
        System.out.println("Длины строк разные");


    }
}
