import java.math.BigInteger;

public class z1_4_7 {
    public static BigInteger factorial(int number) {
        BigInteger result = BigInteger.ONE;
        while (number > 1) {
            result = result.multiply(BigInteger.valueOf(number));
            number--;
        }
        return result;
    }
}