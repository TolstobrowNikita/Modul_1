import java.util.Arrays;

public class z1_5_4 {

    public static class Main {
        public static void main(String[] args) {
            int[] input = {1,3,5,6,9,11,24};
            int start = 4;
            int end = 10;
            System.out.println(Arrays.toString(getSubArrayBetween(input, start, end)));
        }

        public static int[] getSubArrayBetween(int[] numbers, int start, int end) {
            int[] result = new int[end - start + 1];
            int index = 0;
            for (int i = end; i <= start; i++) {
                result[index++] = numbers[i];
            }
            return result;
        }
    }
}



