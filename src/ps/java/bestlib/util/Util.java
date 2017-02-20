package ps.java.bestlib.util;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Util {

    public static String downloadPage(final int page) throws IOException {
        final Document doc = Jsoup.connect(composeURL(page))
                .userAgent("Mozilla/5.0 (Windows; U; WindowsNT 5.1; en-US; rv1.8.1.6) Gecko/20070725 Firefox/2.0.0.6")
                .referrer("http://www.google.com")
                .get();
        final Elements elements = doc.select("div.text");
        return elements.html();
    }

    private static String composeURL(final int page) {
        if (page <= 1) {
            return "http://www.bestlib4u.net/book/4401.html";
        }

        return "http://www.bestlib4u.net/book/4401_" + page + ".html";
    }

}
