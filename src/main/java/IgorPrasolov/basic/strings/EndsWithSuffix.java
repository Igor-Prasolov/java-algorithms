package IgorPrasolov.basic.strings;

import java.util.Scanner;

public class EndsWithSuffix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String suff = scanner.nextLine();
        if (s.length() < suff.length()) {
            System.out.println("ошибка");
            return;
        }
        if (s.substring(s.length() - suff.length(), s.length()).equals(suff)) {
            System.out.println(true);
            return;
        }
        System.out.println(false);
    }
}
