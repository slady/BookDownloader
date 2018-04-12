package ps.java.bestlib.util;

import org.jsoup.nodes.Document;

public class BookBestlib4uFantasyContent implements BookContent {

    private final int bookId;

    private final int pageCount;

    public BookBestlib4uFantasyContent(final int bookId, final int pageCount) {
        this.bookId = bookId;
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String extractContent(final Document doc) {
        return doc.select("div.text").html();
    }

    public String composeURL(final int pageNumber) {
        if (pageNumber <= 1) {
            return "http://www.bestlib4u.net/Fantasy/" + bookId + ".html";
        }

        return "http://www.bestlib4u.net/Fantasy/" + bookId + "_" + pageNumber + ".html";
    }

}
