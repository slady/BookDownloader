package ps.java.bestlib;

import ps.java.bestlib.util.BookDownloader;
import ps.java.bestlib.util.ReadOnlineFreeBook;

import java.io.IOException;

public class ElleKennedyTheScore1 {

	public static void main(String[] args) throws IOException {
		BookDownloader.downloadBook("Elle-Kennedy-The-Deal",
			new ReadOnlineFreeBook("the-score", 98));
	}

}
