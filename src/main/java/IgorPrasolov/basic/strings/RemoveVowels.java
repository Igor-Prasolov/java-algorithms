package IgorPrasolov.basic.strings;

import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().toLowerCase();
        String vowelsRus = "йуеыаоэяию";
        String vowelsEng = "eyuioa";
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {

            if (!vowelsEng.contains(String.valueOf(arr[i])) && !vowelsRus.contains(String.valueOf(arr[i]))) {
                sb.append(arr[i]);
            }
        }
        System.out.println(sb);
    }
}
