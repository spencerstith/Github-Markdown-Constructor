package craigscode.helpers;

import craigscode.components.MDPage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MDWriter {

    public static void write(MDPage markdownPage) throws IOException {
        File file = new File(markdownPage.getFileName());
        FileWriter writer = new FileWriter(file);
        writer.write(markdownPage.toString());
        writer.close();
    }

}
