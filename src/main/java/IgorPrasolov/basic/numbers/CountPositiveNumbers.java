package IgorPrasolov.basic.numbers;

import java.util.Scanner;

public class CountPositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        for (int i = 1; i <= 10; i++) {
            int numbers = scanner.nextInt();
            if (numbers > 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
