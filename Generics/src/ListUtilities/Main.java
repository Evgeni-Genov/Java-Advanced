package ListUtilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Collections.addAll(integers, 1, 2, 18, 2, -1);

        int maxInteger = ListUt.getMax(integers);

        List<String> strings = new ArrayList<>();
        Collections.addAll(strings, "a", "b", "c");

        String minString = ListUt.getMin(strings);
        System.out.println(maxInteger);
        System.out.println(minString);
    }
}