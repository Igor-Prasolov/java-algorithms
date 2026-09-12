package IgorPrasolov.basic.strings;

import java.util.Scanner;

public class ShiftArrayLeft {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().toLowerCase();
        int num = scanner.nextInt();
        char[] arr = s.toCharArray();
        char[] arrRes = new char[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int newRes = (i - num) % arr.length;
            if (newRes < 0) {
                newRes += arr.length;
            }
            arrRes[newRes] = arr[i];
        }

        System.out.println(arrRes);

    }
}
