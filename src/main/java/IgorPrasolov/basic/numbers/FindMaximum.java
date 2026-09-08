package IgorPrasolov.basic.numbers;

import java.util.Scanner;

public class FindMaximum {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();
        for (int i = 1; i < 10; i++) {
            int numbers = scanner.nextInt();
            if (max < numbers) {
                max = numbers;
            }
        }
        System.out.println(max);
    }
}
