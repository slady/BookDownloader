package ps.java.bestlib;

import ps.java.bestlib.util.BookBestlib4uContent;
import ps.java.bestlib.util.BookBestlib4uNewAdultContent;
import ps.java.bestlib.util.BookDownloader;

import java.io.IOException;

public class SamanthaYoung2 {

    public static void main(String[] args) throws IOException {
        BookDownloader.downloadBook("Samantha-Young-2-Down-London-Road",
                new BookBestlib4uNewAdultContent("Down_London_Road", 47));
    }

}
