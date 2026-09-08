package IgorPrasolov.basic.numbers;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int reversed = 0;

        while (num > 0) {
            int digits = num % 10;
            reversed = reversed * 10 + digits;
            num /= 10;

        }
        System.out.println(reversed);
    }
}
