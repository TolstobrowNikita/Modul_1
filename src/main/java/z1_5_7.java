import java.util.Arrays;

public class z1_5_7 {
    public static class MergeAndSort {
        public static class Main {
            public static void main(String[] args) {
                int[] a = {1, 3, 7, 5};
                int[] b = {8, 4, 2, 4};
                int[] result = mergeAndSort(a, b);
                System.out.println(Arrays.toString(result));
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
}

