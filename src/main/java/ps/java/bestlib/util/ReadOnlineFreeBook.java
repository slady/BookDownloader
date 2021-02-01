package ps.java.bestlib.util;

import org.jsoup.nodes.Document;

public class ReadOnlineFreeBook implements BookContent {

	private final String bookId;

	private final int pageCount;

	public ReadOnlineFreeBook(final String bookId, final int pageCount) {
		this.bookId = bookId;
		this.pageCount = pageCount;
	}

	@Override
	public int getPageCount() {
		return pageCount;
	}

	@Override
	public String composeURL(final int pageNumber) {
		return "http://readonlinefreebook.com/" + bookId + "/p-" + pageNumber;
	}

	@Override
	public String extractContent(final Document doc) {
		return doc.select("div.chapterContent").html();
	}

}
