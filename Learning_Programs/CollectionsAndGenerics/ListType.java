package Learning_Programs.CollectionsAndGenerics;

import java.util.ArrayList;
import java.util.List;

public class ListType {
    public static void main(String[] args) {
        
        List<String> strlist = new ArrayList<>();

        strlist.add("Santosh");
        strlist.add(1, "Mane");
        strlist.add(2, "Rakesh");

        if (strlist.contains("Mane")) {
            System.out.println("Removing Mane ....."+ strlist.remove("Mane"));
            strlist.add(1, "jadhav");
            System.out.println(strlist.indexOf("jadhav"));
        }

        for (int index = 0; index < strlist.size(); index++) {
            System.out.println(strlist.get(index));
        }

        Utility.print(strlist);
            
    }
}
