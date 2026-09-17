package IgorPrasolov.basic.arrays;

public class CountEvenAndOdd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int countEven = 0;
        int countOdd = 0;

        for (int i : arr) {
            if (i % 2 == 0) {
                countEven++;
                continue;
            }
            countOdd++;
        }
        System.out.println("Четные: " + countEven + "\nНечетные: " + countOdd);
    }
}
