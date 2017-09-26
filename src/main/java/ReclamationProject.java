/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */
/**
 * This is a class that does this.
 */
public class ReclamationProject {
    /**
     * Main function.
     * @param args Parameters.
     */
    public static void main(final String[] args) {
        System.out.println(doit("llo", "hello"));
    }
    /**
     * Hello.
     * @param c Param.
     * @param d Param.
     * @return Param.
     */
    public static String doit(final String c, final String d) {
        String a = c;
        String b = d;
        if (c.length() > d.length()) {
            a = d;
            b = c;
        }
        String r = "";
        /*
         * For loop with i
         */
        for (int i = 0; i < a.length(); i++) {
            for (int j = a.length() - i; j > 0; j--) {
                for (int k = 0; k < b.length() - j + 1; k++) {
                    if (a.regionMatches(i, b, k, j) && j > r.length()) {
                        r = a.substring(i, i + j);
                    }
                }
            }
        }
        return r;
    }
}
