package IgorPrasolov.basic.arrays;

import java.util.Arrays;

public class ReverseArrayInPlace {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int left = 0;
        int right = arr.length -1;

        while (left < right) {
            int current = arr[left];
            arr[left] = arr[right];
            arr[right] = current;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
