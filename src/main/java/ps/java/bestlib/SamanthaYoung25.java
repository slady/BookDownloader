package ps.java.bestlib;

import ps.java.bestlib.util.BookBestlib4uNewAdultContent;
import ps.java.bestlib.util.BookDownloader;

import java.io.IOException;

public class SamanthaYoung25 {

    public static void main(String[] args) throws IOException {
        BookDownloader.downloadBook("Samantha-Young-2-5-Castle-Hill",
                new BookBestlib4uNewAdultContent("Castle_Hill", 10));
    }

}
