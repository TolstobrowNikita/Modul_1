public class test {
    public static void main(String[] args) {
        z1_2_7 nazvanie = new z1_2_7();
        calcCircleRadius(10);
    }
    public static void calcCircleRadius(double area) {
        double pi = Math.PI;
        double radius = Math.sqrt(area / Math.PI);
        System.out.printf("%.3f", radius);
    }
}
