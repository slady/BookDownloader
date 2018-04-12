package ps.java.bestlib;

import ps.java.bestlib.util.BookBestlib4uFantasyContent;
import ps.java.bestlib.util.BookBestlib4uNewAdultContent;
import ps.java.bestlib.util.BookDownloader;

import java.io.IOException;

public class SamanthaYoung55 {

    public static void main(String[] args) throws IOException {
        BookDownloader.downloadBook("Samantha-Young-5-5-Valentine",
                new BookBestlib4uFantasyContent(6751, 29));
    }

}
