package IgorPrasolov.basic.arrays;

public class CountElementsInRange {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 8, 11};
        int min = 4;
        int max = 9;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= min && arr[i] <= max) {
                count++;
            }
        }
        System.out.println(count);
    }
}
