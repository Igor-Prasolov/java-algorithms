package IgorPrasolov.basic.strings;

import java.util.Scanner;

public class IsValidParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int count = 0;
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {

            if (String.valueOf(arr[i]).equals("(")) {
                count++;
            }
            if (String.valueOf(arr[i]).equals(")")) {
                count--;
            }
            if (count < 0) {
                System.out.println(false);
                return;
            }
        }
        if (count == 0) {
            System.out.println(true);
            return;
        }
        System.out.println(false);
    }
}
