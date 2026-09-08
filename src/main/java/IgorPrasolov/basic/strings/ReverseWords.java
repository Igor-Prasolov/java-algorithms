package IgorPrasolov.basic.strings;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] strings = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = strings.length -1; i >= 0; i--) {
            sb.append(strings[i]).append(" ");
        }


        System.out.println(sb.deleteCharAt(sb.length() - 1));

    }
}
