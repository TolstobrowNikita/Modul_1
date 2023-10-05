import java.math.BigInteger;

public class z1_4_7 {
    public static BigInteger factorial(int value) {
        if (value <= 1) return BigInteger.ONE;
        return BigInteger.valueOf(value).multiply(factorial(value - 1));
    }
}