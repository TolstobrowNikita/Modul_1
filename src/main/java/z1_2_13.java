public class z1_2_13 {
    public static void calcCircleRadius(double area) {
        double pi = Math.PI;
        double radius = Math.sqrt(area / Math.PI);
        System.out.printf("%.3f", radius);
    }
}
