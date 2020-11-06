package craigscode.helpers;

import craigscode.components.MD;
import craigscode.components.MDPage;

import java.io.IOException;

public class Testing {

    public static void send() throws IOException {
        // text
        MDPage page = new MDPage("TEST.md");
        page.text("this is normal text. Line break after.");
        page.textWithLineBreak("this is also normal text but with a line break.");
        page.text("bold text. line break after.", MD.BOLD);
        page.textWithLineBreak("bold again with line break.", MD.BOLD);
        page.text("italicized.", MD.ITALICIZED);
        page.textWithLineBreak("italicized with line break.", MD.ITALICIZED);
        page.text("text bold and italicized", MD.BANDI);
        page.textWithLineBreak("bold and italicized with line break", MD.BANDI);

        // table

        // write
        page.write();
    }

}
