package IgorPrasolov.basic.strings;

import java.util.Scanner;

public class SplitInHalf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String s1 = s.substring(0, s.length() / 2);
        String s2 = s.substring(s.length() / 2, s.length());
        System.out.println(s1 + "\n" + s2);
    }
}
