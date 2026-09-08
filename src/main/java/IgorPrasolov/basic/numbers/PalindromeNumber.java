package IgorPrasolov.basic.numbers;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int reversed = 0;
        int current = num;

        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;

            num /= 10;
        }
        if (reversed == current) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
