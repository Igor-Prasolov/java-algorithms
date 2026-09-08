package IgorPrasolov.basic.numbers;

import java.util.Scanner;

public class CountEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
