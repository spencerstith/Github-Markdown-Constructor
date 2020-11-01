package craigscode;


import craigscode.components.MDPage;
import craigscode.components.MDTable;
import craigscode.components.MDWriter;

class Driver {

    public static void main(String[] args) throws Exception {
        MDPage page = new MDPage("README.md");
        page.addHeader(1, "This is a testing page!");
        page.addText("This really is just a test. New line for sure.", true);
        page.addText("I am figuring out how to do this. ", false);
        page.addText("Hopefully it all works out!", true);
        MDTable table = new MDTable(3);
        String[] header = {"Animal", "Legs", "Coolness Factor"};
        String[] cat = {"Cat", "4", "6"};
        String[] dog = {"Dog", "4", "7"};
        String[] centipede = {"Centipede", "100", "10"};
        table.addHeader(header);
        table.addRow(cat);
        table.addRow(dog);
        table.addRow(centipede);
        page.addTable(table);
        MDWriter.write(page);
    }

}
