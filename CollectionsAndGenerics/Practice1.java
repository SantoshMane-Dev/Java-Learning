package CollectionsAndGenerics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Practice1 {
    public static void main(String[] args) {

        List <String> list = Arrays.asList("Bear", "Zebra", "Lion", "Ant");

        System.out.println(list);
        sortInAscending(list);
        System.out.println(list);
        
    }

    public static void sortInAscending(List<String> list) {
        Collections.sort(list);
    }
}
