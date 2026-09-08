package IgorPrasolov.basic.strings;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().toLowerCase();
        boolean bool = false;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i).) {
                bool = true;
            }
        }
        System.out.println(bool);
    }

}
