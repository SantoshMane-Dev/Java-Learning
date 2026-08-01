package CollectionsAndGenerics;

import java.util.LinkedList;
import java.util.Queue;

public class QueueType {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(12);
        queue.add(265);

        Utility.print(queue);

        System.out.println(queue.peek());
        System.out.println(queue.element());

        Utility.print(queue);

        System.out.println(queue.remove());
        System.out.println(queue.poll());

        Utility.print(queue);


    }
}
