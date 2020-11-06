package craigscode.components;

// TODO: Add the following:
//  images

public class MDPage extends MDComponent {

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

    public void addText(String text, int type) {
        switch(type) {
            case 2:
                text = "**" + text + "**";
                break;
            case 3:
                text = "*" + text + "*";
                break;
            case 4:
                text = "**_" + text + "_**";
                break;
        }
        builder.append(text);
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

    public String toString() {
        return builder.toString();
    }

}
