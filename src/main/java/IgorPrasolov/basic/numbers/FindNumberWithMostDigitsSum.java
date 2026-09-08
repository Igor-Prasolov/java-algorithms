package IgorPrasolov.basic.numbers;

import java.util.Scanner;

public class FindNumberWithMostDigitsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int sum = 0;
        int currentNum = 0;

        for (int i = num1; i <= num2; i++) {
            int currentSum = 0;
            int currentCount= i;
            while (currentCount > 0) {
                int digit = currentCount % 10;
                currentSum += digit;
                currentCount /= 10 ;
            }
            if (sum < currentSum) {
                sum = currentSum;
                currentNum = i;
            }
        }
        System.out.println("Максимальная сумма: " + sum + " у числа: " + currentNum);
    }
}
