package craigscode;


public class Driver {

    public static void main(String[] args) throws Exception {
        MarkdownPage page = new MarkdownPage("README.md");
        page.addHeader(1, "This is a testing page!");
        page.addText("This really is just a test. New line for sure.", true);
        page.addText("I am figuring out how to do this. ", false);
        page.addText("Hopefully it all works out!", true);
        MarkdownTable table = new MarkdownTable(3);
        String[] header = {"Animal", "Legs", "Coolness Factor"};
        String[] cat = {"Cat", "4", "6"};
        String[] dog = {"Dog", "4", "7"};
        String[] centipede = {"Centipede", "100", "10"};
        table.addHeader(header);
        table.addRow(cat);
        table.addRow(dog);
        table.addRow(centipede);
        page.addTable(table);
        MarkdownWriter.write(page);
    }

}
