package IgorPrasolov.basic.numbers;

public class CountMultiplesOfThree {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                int current = i * j;
                if (current % 3 == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
