package IgorPrasolov.basic.strings;

import java.util.Scanner;

public class RemoveDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().toLowerCase();
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (Character ch : arr) {
            if (!Character.isDigit(ch)) {
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }
}
