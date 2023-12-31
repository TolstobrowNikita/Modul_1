import java.util.Arrays;

public class z1_5_5 {


    public static void main(String[] args) {
        int[] array1 = {1, 5, 2, 17};
        System.out.println(Arrays.toString(getArrayMiddle(array1)));

        int[] array2 = {14, 16, 3};
        System.out.println(Arrays.toString(getArrayMiddle(array2)));
    }

    public static int[] getArrayMiddle(int[] numbers) {
        int len = numbers.length;
        int mid = len / 2;

        if (len % 2 == 0) {
            return new int[]{numbers[(mid - 1)], numbers[mid]};

        } else {
            return new int[]{numbers[mid]};

        }
    }
}


