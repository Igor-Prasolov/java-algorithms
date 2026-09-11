package IgorPrasolov.basic.strings;

import java.util.Scanner;

public class CountVowelsPerWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine().toLowerCase();
        String[] strings = s1.split(" ");
        String vowelsRus = "йуеыаоэяию";
        String vowelsEng = "eyuioa";

//        for (int i = 0; i < strings.length; i++) {
//            int currentCount = 0;
//            char[] arr = strings[i].toCharArray();
//            for (int j = 0; j < arr.length; j++) {
//                if (vowelsRus.contains(String.valueOf(arr[j]))) {
//                    currentCount++;
//                }
//                if (vowelsEng.contains(String.valueOf(arr[j]))) {
//                    currentCount++;
//                }
//            }
//
//            System.out.println(strings[i] + ": " + currentCount);
//
//        }

        for (int i = 0; i < strings.length; i++) {
            int currentCount = 0;
            for (int j = 0; j < strings[i].length(); j++) {
                if (vowelsRus.contains(String.valueOf(strings[i].charAt(j)))) {
                    currentCount++;
                }
                if (vowelsEng.contains(String.valueOf(strings[i].charAt(j)))) {
                    currentCount++;
                }
            }
            System.out.println(strings[i] + ": " + currentCount);
        }
    }
}
