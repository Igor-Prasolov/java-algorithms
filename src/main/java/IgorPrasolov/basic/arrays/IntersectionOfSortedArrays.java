package IgorPrasolov.basic.arrays;


import java.util.Scanner;

public class IntersectionOfSortedArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] part = line.split(" ");
        int[] arr1 = new int[part.length];
        for (int i = 0; i < part.length; i++) {
            arr1[i] = Integer.parseInt(part[i]);
        }

        String line2 = scanner.nextLine();
        String[] part2 = line2.split(" ");
        int[] arr2 = new int[part2.length];
        for (int i = 0; i < part2.length; i++) {
            arr2[i] = Integer.parseInt(part2[i]);
        }
        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                System.out.println(arr1[i]);
                i++;
                j++;
                continue;
            }
            if (arr1[i] < arr2[j]) {
                i++;
                continue;
            }
            if (arr1[i] > arr2[j]) {
                j++;
            }
        }
    }
}
