package IgorPrasolov.basic.strings;

import java.util.Scanner;

public class CountCharFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().toLowerCase();
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            int currentCount = 0;
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    currentCount++;
                }
            }
            if (currentCount > 0) {
                continue;
            }
            currentCount = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    currentCount++;
                }
            }
            System.out.println(arr[i] + ": " + currentCount);

        }
    }
}
