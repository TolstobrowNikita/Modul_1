import java.util.Arrays;

public class z1_5_12 {

    public static void main(String[] args) {
        int[] numbers = {3, 5, 20, 8, 7, 3, 100};
        printOddNumbers(numbers);
    }

    public static void printOddNumbers(int[] arr) {
        for (int numbers : arr) {
            if (numbers % 2 != 0) {
                System.out.print(numbers + ",");
            }
        }
        System.out.println();
    }
}