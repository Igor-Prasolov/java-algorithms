package IgorPrasolov.basic.numbers;

import java.util.Scanner;

public class FindNumberWithMostDivisorsAndEvenDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int countDivisors = 0;
        int countEven = 0;
        int maxComposition = 0;
        int maxNum = 0;

        for (int i = num1; i <= num2; i++) {
            int currentNum = i;
            int currentCountDiv = 0;
            int currentCountEv = 0;
            int currentComposition = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    currentCountDiv++;
                }
            }

            while (currentNum > 0) {
                int digit = currentNum % 10;
                if (digit % 2 == 0) {
                    currentCountEv++;
                }
                currentNum /= 10;
            }

            if (countDivisors < currentCountDiv) {
                countDivisors = currentCountDiv;
            }
            if (countEven < currentCountEv) {
                countEven = currentCountEv;
            }

            currentComposition = currentCountEv * currentCountDiv;
            if (maxComposition < currentComposition) {
                maxComposition = currentComposition;
                maxNum = i;
            }
        }

        System.out.println("произведение этих двух значений максимально у числа : " + maxNum);
        System.out.println("произведение " + maxComposition);
        System.out.println("количество делителей: " + countDivisors);
        System.out.println("количество четных цифр: " + countEven);


    }
}
