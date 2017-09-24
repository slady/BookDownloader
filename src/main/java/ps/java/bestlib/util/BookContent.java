package ps.java.bestlib.util;

import org.jsoup.nodes.Document;

public interface BookContent {

    int getPageCount();

    String composeURL(int pageNumber);

    String extractContent(Document doc);

}
