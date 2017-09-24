package ps.java.bestlib.util;

import org.jsoup.nodes.Document;

public class Book7novelsContent implements BookContent {

    private final String pathPartPrefix;

    private final int startingPoint;

    private final int pageCount;

    public Book7novelsContent(final String pathPartPrefix, final int startingPoint, final int pageCount) {
        this.pathPartPrefix = pathPartPrefix;
        this.startingPoint = startingPoint;
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String composeURL(int pageNumber) {
        final int checkSum = startingPoint + pageNumber - 1;
        return "https://www.7novels.com/" + pathPartPrefix + "/page-" + pageNumber + "-" + checkSum + ".html";
    }

    public String extractContent(Document doc) {
        return doc.select("div.chapter-content").html();
    }

}
