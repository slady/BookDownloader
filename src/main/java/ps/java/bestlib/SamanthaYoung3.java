package ps.java.bestlib;

import ps.java.bestlib.util.BookBestlib4uNewAdultContent;
import ps.java.bestlib.util.BookDownloader;

import java.io.IOException;

public class SamanthaYoung3 {

    public static void main(String[] args) throws IOException {
        BookDownloader.downloadBook("Samantha-Young-3-Before-Jamaica-Lane",
                new BookBestlib4uNewAdultContent("Before_Jamaica_Lane", 39));
    }

}
