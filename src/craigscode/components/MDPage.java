package craigscode.components;

// TODO: Add the following:
//  images

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MDPage extends MDComponent {

    private String fileName;
    private StringBuilder builder;

    public MDPage(String fileName) {
        this.fileName = fileName;
        this.builder = new StringBuilder();
    }

    ///////////////////////////////////
    //  TEXT ADDITIONS

    public void text(String text) {
        builder.append(text);
    }

   public void textWithLineBreak(String text) {
        text(text + "\n  ");
   }

    public void text(String text, MD type) {
        switch(type) {
            case BOLD:
                text = "**" + text + "**";
                break;
            case ITALICIZED:
                text = "*" + text + "*";
                break;
            case BANDI:
                text = "**_" + text + "_**";
                break;
        }
        builder.append(text);
    }

    public void textWithLineBreak(String text, MD type) {
        text(text + "\n  ", type);
    }

    public String lineBreak() {
        return "\n  ";
    }

    public void addLink(String text, String url) {
        builder.append(String.format("[%s](%s)", text, url));
    }

    public void addTable(MDTable table) {
        builder.append(table.toString());
    }

    public String getFileName() {
        return fileName;
    }


    public void write() throws IOException {
        File file = new File(fileName);
        FileWriter writer = new FileWriter(file);
        writer.write(builder.toString());
        writer.close();
    }

}
