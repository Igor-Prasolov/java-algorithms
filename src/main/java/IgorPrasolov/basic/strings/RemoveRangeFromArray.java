package IgorPrasolov.basic.strings;

import java.util.Scanner;

public class RemoveRangeFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите слово");
        String s1 = scanner.nextLine().toLowerCase();
        System.out.println("Введите начальный индекс для удаления");
        int num = scanner.nextInt();
        System.out.println("Введите количество символов для удаления");
        int nums = scanner.nextInt();

        char[] arr = s1.toCharArray();
        char[] arr2 = new char[arr.length - nums];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i >= num && i < num + nums) {
                continue;
            }
            arr2[count] = arr[i];
            count++;
        }

        System.out.println(arr2);
    }
}
