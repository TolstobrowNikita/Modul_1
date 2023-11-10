public class z1_6_12 {
    public static class Main {
        public static void main(String[] args) {
            String[] roles = new String[]{"Городничий","Аммос Федорович","Артемий Филиппович","Лука Лукич"};
            String[] textLines = new String[]{
            "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едетревизор.",
            "Аммос Федорович: Как ревизор?",
            "Артемий Филиппович: Как ревизор?",
            "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
            "Аммос Федорович: Вот те на!",
            "Артемий Филиппович: Вот не было заботы, так подай!",
            "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};

            printTextPerRole(roles, textLines);
        }
    }

    public static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder sbTextPerRole = new StringBuilder();
        StringBuilder sbRole = new StringBuilder();
        StringBuilder sbText = new StringBuilder();

        for (int i = 0; i < roles.length; i++) {
            String role = roles[i];
            sbRole.append(role).append(":");
            sbTextPerRole.append(sbRole).append("\n");

            for (int j = 0; j < textLines.length; j++) {

                if (textLines[j].startsWith(sbRole.toString())) {
                    textLines[j] = textLines[j].replaceFirst(sbRole.toString(), "");
                    sbText.append(j + 1).append(")").append(textLines[j]);
                    sbTextPerRole.append(sbText).append("\n");
                    sbText.setLength(0);
                }
            }
            sbTextPerRole.append("\n");
            sbRole.setLength(0);
        }
        System.out.println(sbTextPerRole);
        return sbTextPerRole.toString();
    }
}