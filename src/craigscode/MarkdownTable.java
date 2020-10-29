package craigscode;

import craigscode.exceptions.ColumnMismatchException;
import craigscode.exceptions.MarkdownException;

import java.util.ArrayList;


public class MarkdownTable {

    private String[] headers;
    private ArrayList<String[]> rows;

    MarkdownTable(int columns) {
        this.headers = new String[columns];
        this.rows = new ArrayList<>();
    }

    void addHeader(String[] row) throws MarkdownException {
        if (row.length > headers.length) {
            throw new ColumnMismatchException();
        }
        headers = row;
        rows.add(0, row);
    }

    void addRows(ArrayList<String[]> rows) throws MarkdownException{
        for (String[] row : rows) {
            addRow(row);
        }
    }

    void addRows(String[][] rows) throws MarkdownException {
        for (String row[] : rows) {
            addRow(row);
        }
    }

    void addRow(String[] row) throws MarkdownException {
        if (row.length > headers.length) {
            throw new ColumnMismatchException();
        }
        rows.add(row);
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        // Headers
        for (String string : headers) {
            builder.append("| " + string);
        }
        builder.append("|\n");
        // Divider
        for (String string : headers) {
            builder.append("|");
            for (int i = 0; i < string.length(); i++) {
                builder.append("-");
            }
        }
        builder.append("|\n");
        // Values
        for (int i = 1; i < rows.size(); i++) {
            for (String string : rows.get(i)) {
                builder.append("| " + string);
            }
            builder.append("|\n");
        }

        return builder.toString();
    }

}
