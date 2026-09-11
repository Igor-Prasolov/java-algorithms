package IgorPrasolov.basic.strings;

import java.util.Scanner;

public class ReverseStringInPlace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().toLowerCase();
        char[] arr = s.toCharArray();
        int left = 0;
        int rigth = arr.length - 1;

        while (left < rigth) {
            char ch = arr[left];
            arr[left] = arr[rigth];
            arr[rigth] = ch;
            left++;
            rigth--;
        }
        System.out.println(arr);


    }
}
