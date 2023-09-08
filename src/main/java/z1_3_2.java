public class z1_3_2 {
    public static void main(String[] args) {
        System.out.println(charExpression(22));
        System.out.println(charExpressionNew(22));
    }

    /**
     * В целом правильно, но можно было решить в 1 строчку :)
     */
    public static char charExpression(int a) {
        char c = '\\';
        return (char) (((int) c) + a);
    }

    /**
     * Решение в 1 строчку
     */
    public static char charExpressionNew(int a) {
        return (char) ('\\' + a);
    }
}