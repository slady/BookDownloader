package ps.java.bestlib;

import ps.java.bestlib.util.Book7novelsContent;
import ps.java.bestlib.util.BookDownloader;

import java.io.IOException;

public class TheGirlWithTheDragonTattoo {

    public static void main(String[] args) throws IOException {
        BookDownloader.downloadBook("The-Girl-with-the-Dragon-Tattoo",
                new Book7novelsContent("the-girl-with-the-dragon-tattoo", 1015959, 67));
    }

}
