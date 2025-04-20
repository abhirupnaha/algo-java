package structure.linkedlist;

class Node {
    Object value;
    Node prev;
    Node next;

    Node(Object value) {
        this.value = value;
        prev = null;
        next = null;
    }

    Node(Object value, Node prev, Node next) {
        this.value = value;
        this.prev = prev;
        this.next = next;
    }
}

class DoublyLinkedList {
    Node head = null;
    Node tail = null;
    int size = 0;

    void add(Object value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            newNode.next = null;
        }

        size ++;
    }

    void add(Object value, int idx) {
        if (idx >= size || idx < 0) throw new IndexOutOfBoundsException();

        Node newNode = new Node(value);

        if (idx == 0) {
            head.next = newNode;
            newNode.prev = head;
            head = newNode;
        } else {
            Node curr = head;

            while (idx > 1) {
                idx --;
                curr = curr.next;
            }
            newNode.next = curr.next;
            newNode.prev = curr;
            curr.next.prev = newNode;
            curr.next = newNode;
        }
    }
    
    @Override
    public String toString() {
        if (size == 0) return "[]";

        Node curr = head;
        String st = "[" + curr.value;
        while (curr.next != null) {
            curr = curr.next;
            st += "," + curr.value;
        }
        st += "]";

        return st;
    }
}

class TestDoublyLinkedList {
    
}