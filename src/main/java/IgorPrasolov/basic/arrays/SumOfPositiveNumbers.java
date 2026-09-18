package IgorPrasolov.basic.arrays;

import java.util.Scanner;

public class SumOfPositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] parts = line.split(" ");
        int[] arr = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }

        int sum = 0;
        for (int i : arr) {
            if (i > 0) {
                sum +=i;
            }
        }
        System.out.println(sum);
    }
}
