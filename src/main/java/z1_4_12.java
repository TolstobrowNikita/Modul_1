public class z1_4_12 {
    public static void main(String[] args) throws java.lang.Exception {
        System.out.println(checkWeekend("Sunday")); // "Ура, выходной!"
    }

    void start() {
        checkWeekend("Monday"); // "Надо еще поработать"
        checkWeekend("Tuesday"); // "Надо еще поработать"
        checkWeekend("Wednesday"); // "Надо еще поработать"
        checkWeekend("Thursday"); // "Надо еще поработать"
        checkWeekend("Friday"); // "Надо еще поработать"
        checkWeekend("Saturday"); // "Ура, выходной!"
        checkWeekend("Sunday"); // "Ура, выходной!"
    }

    static String checkWeekend(String weekday) {
        return weekday.equals("Saturday") || weekday.equals("Sunday") ? "Ура, выходной!" : "Надо еще поработать";
    }
}

