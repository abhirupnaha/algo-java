package structure.hash;

import java.util.ArrayList;
import java.util.LinkedList;

class Chaining {

    private ArrayList<LinkedList<Integer>> table;
    private int size;

    Chaining(int size) {
        this.size = size;
        table = new ArrayList<LinkedList<Integer>>(size);

        for (int i = 1; i <= size; i ++) {
            table.add(new LinkedList<Integer>());
        }
    }

    void insert(int key) {
        int pos = key % size;

        table.get(pos).add(key);
    }

    boolean search(int key) {
        int pos = key % size;

        return table.get(pos).contains((Integer) key);
    }

    void remove(int key) {
        int pos = key % size;

        table.get(pos).remove((Integer) key);
    }
}

class TestChaining {
    public static void main(String[] args) {
        Chaining c = new Chaining(7);

        c.insert(70);
        c.insert(71);
        c.insert(9);
        c.insert(56);
        c.insert(72);

        System.out.println(c.search(56));
        System.out.println(c.search(57));
    }
}