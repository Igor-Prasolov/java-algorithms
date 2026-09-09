package IgorPrasolov.basic.strings;

import java.util.Scanner;

public class FindFirstNonRepeatingChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().toLowerCase();
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            int currentCount = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    currentCount++;
                }
            }
            if (currentCount == 1) {
                System.out.println(arr[i]);
                return;
            }
        }
        System.out.println(-1);
    }
}
