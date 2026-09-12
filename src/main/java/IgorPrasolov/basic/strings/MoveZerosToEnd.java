package IgorPrasolov.basic.strings;

import java.util.Scanner;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().toLowerCase();


        char[] arr2 = new char[s.length()];
        int countRight = arr2.length -1;
        int countLeft = 0;

        for (int i = s.length() -1; i >= 0; i--) {
            if (String.valueOf(s.charAt(i)).equals("0")) {
                arr2[countRight] = s.charAt(i);
                countRight--;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (!String.valueOf(s.charAt(i)).equals("0")) {
                arr2[countLeft] = s.charAt(i);
                countLeft++;
            }
        }
        System.out.println(arr2);
    }
}
