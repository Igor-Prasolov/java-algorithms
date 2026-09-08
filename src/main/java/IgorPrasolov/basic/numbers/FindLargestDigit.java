package IgorPrasolov.basic.numbers;

import java.util.Scanner;

public class FindLargestDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int max = 0;
        
        while (num > 0) {
            int digit = num % 10;
            if (max < digit) {
                max = digit;
            }
            num /= 10;
        }
        System.out.println(max);
    }
}
