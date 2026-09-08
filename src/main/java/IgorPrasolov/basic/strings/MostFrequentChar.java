package IgorPrasolov.basic.strings;

import java.util.Scanner;

public class MostFrequentChar {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int countCharMax = 0;
        char cMax = 0;
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            int countCharCurrent = 0;
            for (int j = 0; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    countCharCurrent++;
                }
            }
            if (countCharMax < countCharCurrent) {
                countCharMax = countCharCurrent;
                char c = chars[i];
                cMax = c;
            }
        }

        System.out.println("Самый встречаемый символ " + cMax + ": " + countCharMax);


    }
}
