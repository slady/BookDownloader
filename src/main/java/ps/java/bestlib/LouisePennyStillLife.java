package ps.java.bestlib;

import ps.java.bestlib.util.Util;
import ps.java.bestlib.util.Util7novels;

import java.io.IOException;
import java.io.PrintWriter;

public class LouisePennyStillLife {

    public static void main(String[] args) throws IOException {
        final PrintWriter out = new PrintWriter("Louise-Penny-Still-Life.html");

        out.println("<html><head><meta charset='UTF-8'></head><body>");

        for (int i = 1; i <= 115; i++) {
            out.print(Util7novels.downloadPage("still-life", i, 10001327));
        }

        out.println("</body></html>");

        out.close();
    }

}
