package IgorPrasolov.basic.strings;

import java.util.Scanner;

public class RemoveFirstAndLastChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s.substring(1, s.length() - 1));
    }
}
