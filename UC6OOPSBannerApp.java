public class UC6OOPSBannerApp {

    public static void main(String[] args) {

        String[] o = getOPattern();
        String[] p = getPPattern();
        String[] s = getSPattern();

        for (int i = 0; i < 5; i++) {
            System.out.println(
                    o[i] + " " +
                    o[i] + " " +
                    p[i] + " " +
                    s[i]
            );
        }
    }

    // O pattern
    public static String[] getOPattern() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    // P pattern
    public static String[] getPPattern() {
        return new String[]{
                " ***** ",
                "*     *",
                " ***** ",
                "*      ",
                "*      "
        };
    }

    // S pattern
    public static String[] getSPattern() {
        return new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "     * ",
                " ***** "
        };
    }
}