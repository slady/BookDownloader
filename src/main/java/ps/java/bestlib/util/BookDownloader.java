package ps.java.bestlib.util;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.io.PrintWriter;

public class BookDownloader {

    public static void downloadBook(final String fileName, final BookContent bookContent) throws IOException {
        try (PrintWriter out = new PrintWriter(fileName + ".html")) {
            out.println("<html><head><meta charset='UTF-8'></head><body>");

            for (int i = 1; i <= bookContent.getPageCount(); i++) {
                out.print(bookContent.extractContent(downloadPage(bookContent.composeURL(i))));
            }

            out.println("</body></html>");

            out.close();
        }
    }

    private static Document downloadPage(final String url) throws IOException {
        return Jsoup.connect(url)
                .userAgent("Mozilla/5.0 (Windows; U; WindowsNT 5.1; en-US; rv1.8.1.6) Gecko/20070725 Firefox/2.0.0.6")
                .referrer("http://www.google.com")
                .get();
    }

}
