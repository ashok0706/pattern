package numberpattens;

public class SameNumberPyramidPattern {
    public static void main(String[] args) {
        int size = 5;
        int number = 1;

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(number);
            }
            number++;  // Increment the number for the next row
            System.out.println();
        }
    }
}
