package IgorPrasolov.basic.strings;

import java.util.Scanner;

public class TitleCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().toLowerCase();
        String[] strings = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < strings.length; i++) {
            sb.append(Character.toUpperCase(strings[i].charAt(0)) + strings[i].substring(1));
            sb.append(" ");
        }
        System.out.println(sb);
    }
}
