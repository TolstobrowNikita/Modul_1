public class z1_2_10 {
    public static boolean doubleExpression(double a, double b, double c) {
        boolean WoW = false;
        if (Math.abs((a + b) - c) <= 1E-4) {
            WoW = true;
        }
        return WoW;
    }
}
