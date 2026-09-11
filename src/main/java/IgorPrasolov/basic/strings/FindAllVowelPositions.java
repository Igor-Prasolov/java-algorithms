package IgorPrasolov.basic.strings;

import java.util.Scanner;

public class FindAllVowelPositions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().toLowerCase();
        String vowelsRus = "йуеыаоэяию";
        String vowelsEng = "eyuioa";
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (vowelsRus.contains(String.valueOf(arr[i])) || vowelsEng.contains(String.valueOf(arr[i]))) {
                System.out.println(i);
            }
        }
    }
}
