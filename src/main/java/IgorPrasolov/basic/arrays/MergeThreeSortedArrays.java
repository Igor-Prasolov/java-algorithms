package IgorPrasolov.basic.arrays;

import java.util.Arrays;

public class MergeThreeSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 7};
        int[] arr2 = {2, 5, 8};
        int[] arr3 = {3, 6, 9};
        int[] arr4 = new int[arr1.length + arr2.length + arr3.length];

        int a1 = 0;
        int a2 = 0;
        int a3 = 0;
        int a4 = 0;

        while (a1 < arr1.length && a2 < arr2.length && a3 < arr3.length) {
            if (arr1[a1] < arr2[a2] && arr1[a1] < arr3[a3]) {
                arr4[a4] = arr1[a1];
                a1++;
                a4++;
            } else if (arr1[a1] > arr2[a2] && arr1[a1] < arr3[a3] ) {
                arr4[a4] = arr2[a2];
                a2++;
                a4++;
            } else if (arr1[a1] > arr2[a2] && arr1[a1] > arr3[a3]) {
                arr4[a4] = arr3[a3];
                a3++;
                a4++;
            }
        }
        while (a1 < arr1.length) {
            arr4[a4] = arr1[a1];
            a1++;
            a4++;
        }
        while (a2 < arr2.length) {
            arr4[a4] = arr2[a2];
            a2++;
            a4++;
        }
        while (a3 < arr3.length) {
            arr4[a4] = arr3[a3];
            a3++;
            a4++;
        }
        System.out.println(Arrays.toString(arr4));
    }
}
