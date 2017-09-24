package ps.java.bestlib.util;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Util7novels {

    public static String downloadPage(final String pathPartPrefix, final int page, final int startingPoint) throws IOException {
        final Document doc = Jsoup.connect(composeURL(pathPartPrefix, page, startingPoint))
                .userAgent("Mozilla/5.0 (Windows; U; WindowsNT 5.1; en-US; rv1.8.1.6) Gecko/20070725 Firefox/2.0.0.6")
                .referrer("http://www.google.com")
                .get();
        final Elements elements = doc.select("div.chapter-content");
        return elements.html();
    }

    private static String composeURL(final String pathPartPrefix, final int page, final int startingPoint) {
        final int checkSum = startingPoint + page - 1;
        return "https://www.7novels.com/" + pathPartPrefix + "/page-" + page+ "-" + checkSum + ".html";
    }

}
