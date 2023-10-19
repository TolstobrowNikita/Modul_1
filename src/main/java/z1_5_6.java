import java.util.Arrays;

public class z1_5_6 {
    public static int[] inverseArray(int[] numbers) {
        int len = numbers.length;
        for (int i = 0; i < len / 2; i++) {
            // Swapping
            int temp = numbers[i];
            numbers[i] = numbers[len - i - 1];
            numbers[len - i - 1] = temp;
        }
        return numbers;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 4, 6, 7};
        System.out.println("Пример ввода : " + Arrays.toString(numbers));
        numbers = inverseArray(numbers);
        System.out.println("Пример вывода : " + Arrays.toString(numbers));
    }
}