package IgorPrasolov.basic.strings;

import java.util.Scanner;

public class MostFrequentWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().toLowerCase();
        String[] arr = s.split(" ");
        int countMax = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            int currentCount = 0;
            for (int k = 0; k < i; k++) {
                if (arr[i].equals(arr[k])) {
                    currentCount++;
                }
            }
            if (currentCount > 0) {
                continue;
            }
            currentCount = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    currentCount++;
                }
            }
            if (currentCount > countMax) {
                countMax = currentCount;
                if (sb.length() > 0) {
                    sb.delete(0, sb.length());
                }
                sb.append(arr[i]);
            }
        }
        System.out.println(sb + ": " + countMax);

    }
}
