package craigscode;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MarkdownWriter {

    static void write(MarkdownPage markdownPage) throws IOException {
        File file = new File(markdownPage.getFileName());
        FileWriter writer = new FileWriter(file);
        writer.write(markdownPage.toString());
        writer.close();
    }

}
