package IgorPrasolov.basic.arrays;

import java.util.Scanner;

public class FindIndexOfElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr = {5, 3, 8, 3, 1};

        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}
