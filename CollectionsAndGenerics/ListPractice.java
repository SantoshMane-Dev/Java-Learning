package CollectionsAndGenerics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.Stack;

public class ListPractice {
    public static void main(String[] args) {

        ArrayListPractice();
        LinkedListPractice();
        VectorListPractice();
        StalkListPractice();
        justPractice();
    }

    public static void ArrayListPractice() {

        List<String> list = new ArrayList<>();

        System.out.println("=============================================");

        list.add("Santosh");
        list.add("sujit");
        list.add("oshan");

        list.set(1, "ganesh");

        System.out.println(list);

    }

    public static void LinkedListPractice() {

        LinkedList<String> list = new LinkedList<>();

        System.out.println("=============================================");

        list.add("Sangola");
        list.add("Pune");
        list.add("Mumbai");

        list.addFirst("Kolhapur");
        list.addLast("Sangli");

        System.out.println(list);

    }

    public static void VectorListPractice() {

        Vector<Integer> list = new Vector<>();

        System.out.println("=============================================");

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.remove(4);
        list.remove(Integer.valueOf(2));

        System.out.println(list.size());
        System.out.println(list);
    }

    public static void StalkListPractice() {

        Stack<String> list = new Stack<>();

        System.out.println("=============================================");

        list.push("Santosh");
        list.push("Ramesh");
        list.push("Eshan");
        list.push("Ganusha");

        System.out.println(list.peek());
        list.pop();

        list.push("Radish");

        System.out.println(list);

    }

    public static void justPractice() {

        List<String> list = new ArrayList<>();
        
        System.out.println("=============================================");

        list.add("Santosh");
        list.add("Mane");
        list.add("Is");
        list.add("Not");
        list.add("Good");
        list.add("AT Coding");
        list.add(2, "Well");

        // Methods Used
        System.out.println("----------------------------------");
        System.out.print(" "+ list.get(3));
        System.out.print(" "+ list.set(2, "Are"));
        System.out.print(" "+ list.remove(2));
        System.out.print(" "+ list.contains("AT Coding"));
        System.out.print(" "+ list.size());
        System.out.print(" "+list.isEmpty());
        System.out.print(" "+list.indexOf("Not"));
        System.out.print(" "+list.lastIndexOf("Not"));
        System.out.println(list);
        System.out.println("----------------------------------");

        // Normal For Loop
        System.out.println("----------------------------------");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(" "+ list.get(i));
        }
        System.out.println("\n----------------------------------");

        // Enhanced For Loop
        System.out.println("----------------------------------");
        for (String li : list) {
            System.out.print(" "+ li);
        }
        System.out.println("\n----------------------------------");

        // Iterator Used
        System.out.println("----------------------------------");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(" "+ it.next());
        }
        System.out.println("\n----------------------------------");

        list.clear();

    }
}
