package IgorPrasolov.basic.strings;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().toLowerCase();
        int count = 0;
        String vowelsEng = "eyuioa";
        String vowelsRus = "йуеыаоэяию";

        for (int i = 0; i <= s.length() - 1; i++) {
            if (vowelsEng.contains(String.valueOf(s.charAt(i)))) {
                count++;
            }
            if (vowelsRus.contains(String.valueOf(s.charAt(i)))) {
                count++;
            }
        }

        System.out.println("В слове " + s + " количество гласных букв: " + count);
    }
}
