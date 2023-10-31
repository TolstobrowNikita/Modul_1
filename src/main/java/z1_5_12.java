import java.util.Arrays;

public class z1_5_12 {

    public static void main(String[] args) {
        int[] numbers = {3, 5, 20, 8, 7, 3, 100};
        printOddNumbers(numbers);
    }

    public static void printOddNumbers(int[] arr) {
        for (int i : arr) {
            if (i % 2 != 0) {
                System.out.print(i);
                if (arr.length > 1 && i == arr[arr.length - 1]) {
                    continue;
                }

                System.out.print(",");
            }
        }
    }
}