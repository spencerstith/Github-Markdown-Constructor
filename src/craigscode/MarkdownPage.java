package craigscode;

import craigscode.exceptions.HeaderOutOfBoundsException;
import craigscode.exceptions.MarkdownException;

// TODO: Add the following:
//  italics and bold
//  images

public class MarkdownPage {

    private String fileName;
    private StringBuilder builder;

    MarkdownPage(String fileName) {
        this.fileName = fileName;
        this.builder = new StringBuilder();
    }

    void addText(String text, boolean newLine) {
        builder.append(text);
        if (newLine) {
            builder.append("  \n");
        }
    }

    void addHeader(int strength, String value) throws MarkdownException {
        System.out.println();

        if (strength < 1 || strength > 6) {
            throw new HeaderOutOfBoundsException();
        }
        for (int i = 1; i <= strength; i++) {
            builder.append('#');
        }
        builder.append(' ' + value + "\n");
    }

    void addTable(MarkdownTable table) {
        builder.append(table.toString());
    }

    String getFileName() {
        return fileName;
    }

    public String toString() {
        return builder.toString();
    }

}
