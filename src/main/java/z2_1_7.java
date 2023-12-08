public class z2_1_7 {
    public enum Day {
        MONDAY("Понедельник"),
        TUESDAY("Вторник"),
        WEDNESDAY("Среда"),
        THURSDAY("Четверг"),
        FRIDAY("Пятница"),
        SATURDAY("Суббота"),
        SUNDAY("Воскресенье");

        private final String rusName;

        private Day(String rusName) {
            this.rusName = rusName;
        }

        public boolean isWeekend() {
            return this == SATURDAY || this == SUNDAY;
        }

        public String getRusName() {
            return rusName;
        }
    }
}
