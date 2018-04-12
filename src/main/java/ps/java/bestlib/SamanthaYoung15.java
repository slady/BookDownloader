package ps.java.bestlib;

import ps.java.bestlib.util.BookBestlib4uContent;
import ps.java.bestlib.util.BookBestlib4uNewAdultContent;
import ps.java.bestlib.util.BookDownloader;

import java.io.IOException;

public class SamanthaYoung15 {

    public static void main(String[] args) throws IOException {
        BookDownloader.downloadBook("Samantha-Young-1-5-Until-Fountain-Bridge",
                new BookBestlib4uNewAdultContent("Until_Fountain_Bridge", 13));
    }

}
