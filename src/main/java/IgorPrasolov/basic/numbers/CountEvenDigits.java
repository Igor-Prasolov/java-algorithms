package IgorPrasolov.basic.numbers;

import java.util.Scanner;

public class CountEvenDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int num = scanner.nextInt();

        while (num > 0) {
            int digits = num % 10;
            if (digits % 2 == 0) {
                count++;
            }
            num /= 10;
        }
        System.out.println(count);
    }
}
