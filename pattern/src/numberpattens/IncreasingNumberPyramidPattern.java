package numberpattens;

public class IncreasingNumberPyramidPattern {
    public static void main(String[] args) {
        int size = 5;
        int currentNumber = 1;

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(currentNumber + " ");
                currentNumber++;
            }
            System.out.println();
        }
    }
}
