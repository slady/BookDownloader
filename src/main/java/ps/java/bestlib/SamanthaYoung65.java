package ps.java.bestlib;

import ps.java.bestlib.util.BookBestlib4uFantasyContent;
import ps.java.bestlib.util.BookBestlib4uUnknownContent;
import ps.java.bestlib.util.BookDownloader;

import java.io.IOException;

public class SamanthaYoung65 {

    public static void main(String[] args) throws IOException {
        BookDownloader.downloadBook("Samantha-Young-6-5-One-Kings-Way",
                new BookBestlib4uUnknownContent(8429, 33));
    }

}
