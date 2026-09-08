package IgorPrasolov.basic.numbers;

import java.util.Scanner;

public class CountNumbersGreaterThanN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = scanner.nextInt();
        int count = 0;

        for (int i = 1; i <= 10; i++) {
            int num = scanner.nextInt();
            if (n < num) {
                count++;
            }
        }
        System.out.println(count);
    }
}
