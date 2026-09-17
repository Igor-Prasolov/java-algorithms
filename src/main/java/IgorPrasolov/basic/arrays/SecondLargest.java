package IgorPrasolov.basic.arrays;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] parts = line.split(" ");
        int[] arr = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }

        int secondNum = 0;
        int maxNum = 0;

        for (int i : arr) {
            if (i > maxNum) {
                secondNum = maxNum;
                maxNum = i;
            } else if (i > secondNum) {
                secondNum = i;

            }
        }
        System.out.println(maxNum);
        System.out.println(secondNum);

    }
}
