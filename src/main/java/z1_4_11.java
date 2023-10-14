public class z1_4_11 {
    public static boolean isWeekend(String weekday) {
        if (weekday.equals("Monday") || weekday.equals("Tuesday")
                || weekday.equals("Wednesday")
                || weekday.equals("Thursday")
                || weekday.equals("Friday")) {
            return false;
        } else if (weekday.equals("Saturday") || weekday.equals("Sunday")) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isWeekend("Sunday"));
    }
}


