package craigscode.components;

import craigscode.exceptions.HeaderOutOfBoundsException;
import craigscode.exceptions.MDException;

// TODO: Add the following:
//  images

public class MDPage {

    private String fileName;
    private StringBuilder builder;

    public MDPage(String fileName) {
        this.fileName = fileName;
        this.builder = new StringBuilder();
    }

    ///////////////////////////////////
    //  TEXT ADDITIONS

    public void addText(String text) {
        builder.append(text);
    }

    public void addBoldText(String text) {
        builder.append("**" + text + "**");
    }

    public void addItalicizedText(String text) {
        builder.append("*" + text + "*");
    }

    public void addLineBreak() {
        builder.append("  \n");
    }

    public void addLink(String text, String url) {
        builder.append(String.format("[%s](%s)", text, url));
    }

    public void addHeader(int strength, String value) throws MDException {
        System.out.println();

        if (strength < 1 || strength > 6) {
            throw new HeaderOutOfBoundsException();
        }
        for (int i = 1; i <= strength; i++) {
            builder.append('#');
        }
        builder.append(' ' + value + "\n");
    }

    public void addTable(MDTable table) {
        builder.append(table.toString());
    }

    public String getFileName() {
        return fileName;
    }

    public String toString() {
        return builder.toString();
    }

}
