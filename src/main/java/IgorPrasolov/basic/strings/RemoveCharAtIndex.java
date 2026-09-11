package IgorPrasolov.basic.strings;

import java.util.Scanner;

public class RemoveCharAtIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().toLowerCase();
        int num = scanner.nextInt();
        char[] arr = s.toCharArray();
        char[] arr2 = new char[arr.length - 1];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i != num) {
                arr2[count] = arr[i];
                count++;
            }

        }
        System.out.println(arr2);



    }
}
