package IgorPrasolov.basic.arrays;

import java.util.Scanner;

public class CountElementOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr = {5, 3, 8, 3, 1, 3};
        int count = 0;

        for (int i : arr) {
            if (i == num) {
                count++;
            }
        }
        System.out.println(count);
    }
}
