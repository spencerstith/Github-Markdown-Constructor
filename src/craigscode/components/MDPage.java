package craigscode.components;

import craigscode.exceptions.HeaderOutOfBoundsException;
import craigscode.exceptions.MarkdownException;

// TODO: Add the following:
//  italics and bold
//  images

public class MDPage {

    private String fileName;
    private StringBuilder builder;

    public MDPage(String fileName) {
        this.fileName = fileName;
        this.builder = new StringBuilder();
    }

    public void addText(String text, boolean newLine) {
        builder.append(text);
        if (newLine) {
            builder.append("  \n");
        }
    }

    public void addHeader(int strength, String value) throws MarkdownException {
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
