package ps.java.bestlib;

import ps.java.bestlib.util.BookBestlib4uContent;
import ps.java.bestlib.util.BookBestlib4uNewAdultContent;
import ps.java.bestlib.util.BookDownloader;

import java.io.IOException;

public class SamanthaYoung1 {

    public static void main(String[] args) throws IOException {
        BookDownloader.downloadBook("Samantha-Young-1-On-Dublin-Street",
                new BookBestlib4uNewAdultContent("On_Dublin_Street", 41));
    }

}
