import java.util.Arrays;

public class z1_5_11 {
    public static class Main {
        public static void main(String[] args) {
            int[] firstArray = {};
            int[] secondArray = {1, 4, 3};

            System.out.print("Пример ввода: ");
            System.out.println(Arrays.toString(firstArray));
            System.out.println(Arrays.toString(secondArray));

            int[] sortedMergedArray = mergeAndSort(firstArray, secondArray);

            System.out.print("Пример вывода: ");
            System.out.println(Arrays.toString(sortedMergedArray));
        }

        public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
            int[] result = new int[firstArray.length + secondArray.length];
            for (int i = 0; i < firstArray.length; i++) {
                result[i] = firstArray[i];
            }
            for (int j = 0; j < secondArray.length; j++) {
                result[firstArray.length + j] = secondArray[j];
            }
            Arrays.sort(result);
            return result;
        }
    }
}