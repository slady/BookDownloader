package ps.java.bestlib;

import ps.java.bestlib.util.BookBestlib4uContent;
import ps.java.bestlib.util.BookDownloader;

import java.io.IOException;

public class ElleKennedyTheDeal {

    public static void main(String[] args) throws IOException {
        BookDownloader.downloadBook("Elle-Kennedy-The-Deal",
                new BookBestlib4uContent(4401, 115));
    }

}
