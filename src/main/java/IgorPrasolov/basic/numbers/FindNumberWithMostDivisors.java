package IgorPrasolov.basic.numbers;

import java.util.Scanner;

public class FindNumberWithMostDivisors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int maxCount = 0;
        int maxNum = 0;


        for (int i = num1; i <= num2; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxNum = i;
            }
        }
        System.out.println(maxCount);
        System.out.println("Максимальный каунт у числа: " + maxNum);
    }
}
