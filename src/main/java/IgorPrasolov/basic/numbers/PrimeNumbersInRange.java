package IgorPrasolov.basic.numbers;

import java.util.Scanner;

public class PrimeNumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        for (int i = num1; i <= num2; i++) {
            boolean bool = false;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    bool = true;
                }
            }
            if (bool == false) {
                System.out.println(i);
            }
        }
    }
}
