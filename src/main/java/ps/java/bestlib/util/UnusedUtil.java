package ps.java.bestlib.util;

import java.io.File;

public class UnusedUtil {

    public static void createDirectory(final String dirName) {
        final File dir = new File(dirName);
        dir.mkdirs();
    }

    public static String nums3(final int num) {
        if (num > 99)
            return "" + num;

        if (num > 9)
            return "0" + num;

        return "00" + num;
    }

    public static String nums2(final int num) {
        if (num > 9)
            return "" + num;

        return "0" + num;
    }

}
