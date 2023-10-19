import java.util.Arrays;

public class z1_5_4 {

    public static class Main {
        public static void main(String[] args) {
            int[] numbers = {1, 3, 5, 6, 9, 11, 24};
            int start = 4;
            int end = 10;
            int[] result = getSubArrayBetween(numbers, start, end);

            System.out.println("Пример вывода:");
            for (int i = 0; i < result.length; i++) {
                System.out.println(result[i]);
            }
        }
    }

    public static int[] getSubArrayBetween(int[] numbers, int start, int end) {
        int elementsCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= start && numbers[i] <= end) {
                elementsCount++;
            }
        }
        int indexToInsert = 0;
        int[] result = new int[elementsCount];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= start && numbers[i] <= end) {
                result[indexToInsert] = numbers[i];
                indexToInsert++;
            }
        }
        return result;
    }
}




