public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = new String[4];

        banner[0] = String.join(" ",
                " ***** ", " ***** ", " ***** ", " ***** ");

        banner[1] = String.join(" ",
                "*     *", "*     *", " ***** ", " *****");

        banner[2] = String.join(" ",
                "*     *", "*     *", " *     ", "     *");

        banner[3] = String.join(" ",
                " ***** ", " ***** ", " *     ", " ***** ");

        for (String line : banner) {
            System.out.println(line);
        }
    }
}
