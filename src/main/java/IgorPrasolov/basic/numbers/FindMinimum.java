package IgorPrasolov.basic.numbers;

import java.util.Scanner;

public class FindMinimum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt();
        for (int i = 1; i < 10; i++) {
            int numbers = scanner.nextInt();
            if (min > numbers) {
                min = numbers;
            }
        }
        System.out.println(min);
    }
}
