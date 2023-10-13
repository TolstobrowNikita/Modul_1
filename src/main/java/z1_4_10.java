public class z1_4_10 {

    public static void main(String[] args) {
        String weekday = "saturday";
        System.out.println(isWeekend(weekday));
    }

    public static boolean isWeekend(String weekday) {
        switch (weekday.toLowerCase()) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                return false;
            case "saturday":
            case "sunday":
                return true;
            default:
                return false;
        }
    }
}