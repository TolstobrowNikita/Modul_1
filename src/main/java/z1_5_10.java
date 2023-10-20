import java.util.Arrays;

public class z1_5_10 {

    public static class Main {
        public static void main(String[] args) {
            int[] input = {14, 16, 3};
            int[] result = getArrayMiddle(input);
            System.out.println(Arrays.toString(result));
        }

        public static int[] getArrayMiddle(int[] numbers) {
            if (numbers.length == 0) return new int[0];

            int length = numbers.length;
            if (length % 2 == 0) {
                int middle = length / 2;
                return new int[]{numbers[middle - 1], numbers[middle]};
            } else {
                int middle = (length - 1) / 2;
                return new int[]{numbers[middle]};
            }
        }
    }
}
