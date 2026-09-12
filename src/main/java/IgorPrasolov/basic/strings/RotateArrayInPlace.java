package IgorPrasolov.basic.strings;

import java.util.Scanner;

public class RotateArrayInPlace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().toLowerCase();
        char[] arr = s.toCharArray();
        int num = scanner.nextInt();


        for (int i = 0; i < arr.length; i++) {
            int newRes = (i + num) % arr.length;
            char[] right =
        }
    }
}
