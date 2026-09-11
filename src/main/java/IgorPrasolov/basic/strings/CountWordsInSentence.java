package IgorPrasolov.basic.strings;

import java.util.Scanner;

public class CountWordsInSentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().toLowerCase();
        String[] strings = s.split("\\s+");
        System.out.println(strings.length);
    }
}
