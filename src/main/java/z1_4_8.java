import java.math.BigInteger;

public class z1_4_8 {
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }

    public static BigInteger factorial(int number) {
        if (number == 0) {
            return BigInteger.valueOf(1);
        } else {
            return factorial(number - 1).multiply(BigInteger.valueOf(number));
        }
    }
}
