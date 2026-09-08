package IgorPrasolov.basic.numbers;

import java.util.Scanner;

public class FindNumberWithMostEvenDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int count = 0;
        int number = 0;


        for (int i = num1; i <= num2; i++) {
            int currentNum = i;
            int currentCount = 0;
            while (currentNum > 0) {
                int digit = currentNum % 10;
                if (digit % 2 == 0) {
                    currentCount++;
                }
                currentNum /= 10;
            }
            if (count < currentCount) {
                count = currentCount;
                number = i;
            }
        }
        System.out.println("наибольшее число четных чисел: " + count + " у числа " + number);
    }
}
