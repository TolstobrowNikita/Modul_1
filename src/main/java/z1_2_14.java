import java.math.BigInteger;

public class z1_2_14 {
    public static void main(String[] args) {
        BigInteger maxLong = BigInteger.valueOf(Long.MAX_VALUE);
        BigInteger sqrt = maxLong.multiply(maxLong);
        System.out.println(sqrt);
    }
}