package ps.java.bestlib;

import ps.java.bestlib.util.BookBestlib4uNewAdultContent;
import ps.java.bestlib.util.BookDownloader;

import java.io.IOException;

public class SamanthaYoung4 {

    public static void main(String[] args) throws IOException {
        BookDownloader.downloadBook("Samantha-Young-4-Fall-from-India-Place",
                new BookBestlib4uNewAdultContent("Fall_from_India_Place", 37));
    }

}
