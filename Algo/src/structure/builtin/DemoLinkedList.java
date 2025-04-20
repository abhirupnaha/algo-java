package structure.builtin;

import java.util.LinkedList;

class DemoLinkedList {
    
    public static void main(String[] args) {    
        // It is a doubly linked list
        LinkedList<Integer> list = new LinkedList<>();

        // add element to last
        list.add(23);
        list.add(45);
        list.add(21);
        list.add(98);

        System.out.println(list);

        // add element to first
        list.addFirst(99);
        list.addFirst(1);

        System.out.println(list);

        // get element in index
        int elem = list.get(3);
        System.out.println(elem);

        // get last and first element
        elem = list.getLast();
        System.out.println(elem);
        elem = list.getFirst();
        System.out.println(elem);

        // size
        System.out.println(list.size());
    }
}
