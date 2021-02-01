package ps.java.bestlib.util;

import org.jsoup.nodes.Document;

public class FreeBestBooks implements BookContent {

	private final int bookId;

	private final int pageCount;

	public FreeBestBooks(final int bookId, final int pageCount) {
		this.bookId = bookId;
		this.pageCount = pageCount;
	}

	@Override
	public int getPageCount() {
		return pageCount;
	}

	@Override
	public String composeURL(final int pageNumber) {
		if (pageNumber <= 1) {
			return "https://www.free-best-books.com/new-adult/" + bookId + ".html";
		}

		return "https://www.free-best-books.com/new-adult/" + bookId + "_" + pageNumber + ".html";
	}

	@Override
	public String extractContent(final Document doc) {
		return doc.select("text").html();
	}

}
