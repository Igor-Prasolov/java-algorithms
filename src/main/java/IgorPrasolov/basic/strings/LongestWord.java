package IgorPrasolov.basic.strings;

import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine().toLowerCase();
        String[] strings = s1.split(" ");
        int maxCount = 0;
        String s2 = null;

        for (int i = 0; i < strings.length; i++) {
            int currentCount = strings[i].length();
            if (maxCount < currentCount) {
                maxCount = currentCount;
                s2 = strings[i];
            }
        }
        System.out.println("слово с максимальной длиной: " + s2 + " - символов: " + maxCount);
    }
}
