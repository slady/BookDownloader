package ps.java.bestlib;

import ps.java.bestlib.util.Util;

import java.io.IOException;
import java.io.PrintWriter;

public class ElleKennedyTheDeal {

    public static void main(String[] args) throws IOException {
        final PrintWriter out = new PrintWriter("Elle-Kennedy-The-Deal.html");

        for (int i = 1; i <= 115; i++) {
            out.print(Util.downloadPage(i));
        }

        out.close();
    }

}
