package craigscode.components;

import craigscode.exceptions.ColumnMismatchException;
import craigscode.exceptions.MDException;
import craigscode.helpers.Functional;

import java.util.ArrayList;


public class MDTable {

    private String[] header;
    private ArrayList<String[]> rows;

    public MDTable(int columns) {
        this.header = new String[columns];
        this.rows = new ArrayList<>();
    }

    public MDTable(String[] header) {
        this.header = header;
        this.rows = new ArrayList<>();
    }

    public MDTable(ArrayList<String> header) {
        this(Functional.toArray(header));
    }

    public void setHeader(String[] newHeader) throws MDException {
        if (newHeader.length > header.length) {
            throw new ColumnMismatchException();
        }
        header = newHeader;
        rows.add(0, newHeader);
    }

    public void setHeader(ArrayList<String> newHeader) throws MDException {
        setHeader(Functional.toArray(newHeader));
    }

    public void addRows(ArrayList<String[]> rows) throws MDException {
        for (String[] row : rows) {
            addRow(row);
        }
    }

    public void addRows(String[][] rows) throws MDException {
        for (String[] row : rows) {
            addRow(row);
        }
    }

    public void addRow(String[] row) throws MDException {
        if (row.length > header.length) {
            throw new ColumnMismatchException();
        }
        rows.add(row);
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        // header
        for (String string : header) {
            builder.append("| ").append(string);
        }
        builder.append("|\n");
        // Divider
        for (String string : header) {
            builder.append("|");
            for (int i = 0; i < string.length(); i++) {
                builder.append("-");
            }
        }
        builder.append("|\n");
        // Values
        for (int i = 1; i < rows.size(); i++) {
            for (String string : rows.get(i)) {
                builder.append("| ").append(string);
            }
            builder.append("|\n");
        }

        return builder.toString();
    }

}
