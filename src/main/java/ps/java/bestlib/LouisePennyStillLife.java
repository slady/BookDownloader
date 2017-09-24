package ps.java.bestlib;

import ps.java.bestlib.util.Book7novelsContent;
import ps.java.bestlib.util.BookDownloader;

import java.io.IOException;

public class LouisePennyStillLife {

    public static void main(String[] args) throws IOException {
        BookDownloader.downloadBook("Louise-Penny-Still-Life",
                new Book7novelsContent("still-life", 10001327, 115));
    }

}
