package IgorPrasolov.basic.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String line2 = scanner.nextLine();
        String[] parts = line.split(" ");
        String[] parts2 = line2.split(" ");
        int[] arr1 = new int[parts.length];
        int[] arr2 = new int[parts2.length];

        for (int i = 0; i < parts.length; i++) {
            arr1[i] = Integer.parseInt(parts[i]);
        }
        for (int i = 0; i < parts2.length; i++) {
            arr2[i] = Integer.parseInt(parts2[i]);
        }

        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                arr3[k] = arr1[i];
                i++;
                k++;
                continue;
            }
            arr3[k] = arr2[j];
            j++;
            k++;
        }
        while (i < arr1.length) {
            arr3[k] = arr1[i];
            i++;
            k++;
        }
        while (j < arr2.length) {
            arr3[k] = arr2[j];
            j++;
            k++;
        }

        System.out.println(Arrays.toString(arr3));
    }
}
