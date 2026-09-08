package IgorPrasolov.basic.numbers;

import java.util.Scanner;

public class MaxOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int one = scanner.nextInt();
        int two = scanner.nextInt();

        if (one > two) {
            System.out.println(one);
        } else {
            System.out.println(two);
        }
    }
}
