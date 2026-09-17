package IgorPrasolov.basic.arrays;

public class SumAndAverageOfArray {
    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8};
        double average = 0;
        int sum = 0;

        for (int i : arr) {
            sum += i;
        }
        average = (double) sum / arr.length;
        System.out.println(sum + " - " + average);

    }
}
