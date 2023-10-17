import java.util.Arrays;

public class z1_5_4 {

    public static class Main {

        public static void main(String[] args) {

            int[] inputArray = {1, 3, 5, 6, 9, 11, 24};
            int start = 4;
            int end = 10;

            int[] subArray = getSubArrayBetween(inputArray, start, end);

            System.out.println("Output: " + Arrays.toString(subArray));
        }
    }

    public static int[] getSubArrayBetween(int[] numbers, int start, int end) {
        int[] subArr = new int[end - start + 1];
        for (int i = start, j = 0; i <= end; i++, j++) {
            subArr[j] = numbers[i];
        }
        return subArr;
    }
}

