package Starpaterns;

public class RhombusPattern {
    public static void main(String[] args) {
        int size = 5;

        for (int i = 1; i <= size; i++) {
            for (int j = size - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= size; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

