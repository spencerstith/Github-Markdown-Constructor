package craigscode.helpers;

import java.util.ArrayList;

public class Functional {

    public static String[] toArray(ArrayList<String> arr) {
        String[] toReturn = new String[arr.size()];
        toReturn = arr.toArray(toReturn);
        return toReturn;
    }

}
