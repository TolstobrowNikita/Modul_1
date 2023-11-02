public class z1_6_11 {

    public static class Main {
        public static void main(String[] args) {
            String email =  "@outlook.com";
            if (isGmailOrOutlook(email)) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }

        public static boolean isGmailOrOutlook(String email) {
            if (email.endsWith("outlook.com")) {
                return false;
            } else if (email.endsWith("gmail.com")) {
                return true;
            }
            return false;
        }
    }
}