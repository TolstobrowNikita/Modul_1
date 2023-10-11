import java.util.Scanner;

public class z1_4_9 {
    public static void main(String[] args) {
        System.out.println(determineGroup(77));
    }

    public static int determineGroup(int age) {
        if (age >= 7 && age <= 13) {
            return 1;
        } else if (age > 13 && age <= 17) {
            return 2;
        } else {
            if (age <= 65 && age >= 18) {
                return 3;
            } else {
                return -1;
            }
        }
    }
}
