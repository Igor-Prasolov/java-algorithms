package IgorPrasolov.basic.arrays;

public class FindMaxInArray {
    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 9, 4};
        int max = arr[0];
        for (int i : arr) {
            if (max < i) {
                max = i;
            }
        }
        System.out.println(max);
    }
}
