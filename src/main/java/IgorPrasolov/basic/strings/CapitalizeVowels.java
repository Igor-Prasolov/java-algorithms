package IgorPrasolov.basic.strings;

import java.util.Scanner;

public class CapitalizeVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().toLowerCase();
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        String vowelsRus = "йуеыаоэяи";
        String vowelsEng = "eyuioa";

        for (Character ch:arr) {
            if (vowelsRus.contains(String.valueOf(ch)) || vowelsEng.contains(String.valueOf(ch))) {
                sb.append(Character.toUpperCase(ch));
                continue;
            }
            sb.append(ch);
        }
        System.out.println(sb);
    }
}
