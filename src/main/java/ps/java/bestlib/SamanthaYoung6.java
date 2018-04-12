package ps.java.bestlib;

import ps.java.bestlib.util.BookBestlib4uContent;
import ps.java.bestlib.util.BookDownloader;

import java.io.IOException;

public class SamanthaYoung6 {

    public static void main(String[] args) throws IOException {
        BookDownloader.downloadBook("Samantha-Young-6-Moonlight-on-Nightingale-Way",
                new BookBestlib4uContent(6752, 104));
    }

}
