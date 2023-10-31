import java.math.*;

public class z1_6_10 {

    public static void main(String[] args) {
        String number = "64";
        long result = parseAndSqrt(String.valueOf(Math.sqrt(Long.parseLong(number))));
        System.out.println(result);
    }

    public static long parseAndSqrt(String number) {

        BigDecimal bd = new BigDecimal(number);
        return bd.setScale(0, RoundingMode.HALF_UP).longValue();
    }
}
