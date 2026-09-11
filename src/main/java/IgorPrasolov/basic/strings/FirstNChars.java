package IgorPrasolov.basic.strings;

import java.util.Scanner;

public class FirstNChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int num = scanner.nextInt();



        if (num > s.length()) {
            System.out.println(s);
            return;
        }
        System.out.println((s.substring(0, num)));

    }
}
