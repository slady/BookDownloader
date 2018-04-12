package ps.java.bestlib;

import ps.java.bestlib.util.BookBestlib4uContent;
import ps.java.bestlib.util.BookBestlib4uNewAdultContent;
import ps.java.bestlib.util.BookDownloader;

import java.io.IOException;

public class SamanthaYoung5 {

    public static void main(String[] args) throws IOException {
        BookDownloader.downloadBook("Samantha-Young-5-Echoes-of-Scotland-Street",
                new BookBestlib4uContent(3907, 37));
    }

}
