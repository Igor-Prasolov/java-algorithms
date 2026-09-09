package IgorPrasolov.basic.strings;

import java.util.Arrays;
import java.util.Scanner;

public class CountWordFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().toLowerCase();

        String[] arr = s.split(" ");

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int k = 0; k < i; k++) {
                if (arr[k].equals(arr[i])) {
                    count++;
                }
            }
            if (count > 0) {
                continue;
            }
            count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j].equals(arr[i])) {
                    count++;
                }
            }
            System.out.println(arr[i] + ": " + count);

        }
    }
}
