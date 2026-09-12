package IgorPrasolov.basic.strings;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().toLowerCase();
        int num = scanner.nextInt();
        char[] arr = new char[s.length() * num];
//        int count = 0;
//        int countI = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.charAt(i % s.length());

//            arr[count] = s.charAt(countI);
//            countI++;
//            count++;
//            if (countI > s.length() - 1) {
//                countI = 0;
//            }
        }
        System.out.println(arr);
    }
}



