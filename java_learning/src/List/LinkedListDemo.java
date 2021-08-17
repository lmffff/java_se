package List;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("hello");
        linkedList.add("world");
        linkedList.add("java");
        System.out.println(linkedList);
        linkedList.addFirst("tired");
        linkedList.addLast("sleepy");
        System.out.println(linkedList);

        System.out.println(linkedList.getFirst());

    }
}
