package IgorPrasolov.basic.strings;

import java.util.Scanner;

public class IsPalindromeIgnoringSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().toLowerCase();
        String clean = s.replace(" ", "");
        StringBuilder sb = new StringBuilder(clean);
        if (sb.reverse().toString().equals(clean)) {
            System.out.println(true);
            return;
        }
        System.out.println(false);
    }
}
