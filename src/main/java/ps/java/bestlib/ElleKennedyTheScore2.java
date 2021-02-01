package ps.java.bestlib;

import ps.java.bestlib.util.BookDownloader;
import ps.java.bestlib.util.FreeBestBooks;

import java.io.IOException;

public class ElleKennedyTheScore2 {

	public static void main(String[] args) throws IOException {
		BookDownloader.downloadBook("Elle-Kennedy-The-Deal",
			new FreeBestBooks(4709, 77));
	}

}
