package structure.linkedlist;

class Node {
    Object value;
    Node next;

    Node(Object value) {
        this.value = value;
        next = null;
    }
}

class SinglyLinkedList {
    private Node head = null;
    private Node tail = null;
    private int size = 0;
    
    void add(Object value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        size ++;
    }

    void add(Object value, int idx) {
        if (idx >= size || idx < 0) throw new IndexOutOfBoundsException();

        Node newNode = new Node(value);
        Node curr = head;
        
        if (idx == 0) {
            newNode.next = head;
            head = newNode;
        } 
        else {
            while (idx > 1) {
                idx --;
                curr = curr.next;
            }
            newNode.next = curr.next;
            curr.next = newNode;
        }

        size ++;
    }

    boolean remove(int idx) {
        if (idx >= size || idx < 0) throw new IndexOutOfBoundsException();
        
        if (idx == 0) {
            head = head.next;
        } else {
            Node curr = head;
            while (idx > 1) {
                idx --;
                curr = curr.next;
            }
            curr.next = curr.next.next;
        }

        size --;
        return true;
    }

    void reverse() {
        if (size == 0 || size == 1) return;

        Node prev = null, curr = head, temp;

        while (curr != null) {
            temp = curr;
            curr = curr.next;
            temp.next = prev;
            prev = temp;
        }
        tail = head;
        head = prev;
    }

    int getSize() { return size; }

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

class TestSinglyLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        for (int i = 21; i <= 27; i ++) list.add(i);
        System.out.println(list);

        list.add(111, 0);
        System.out.println(list);

        list.add(999, 7);
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        list.remove(list.getSize() - 1);
        System.out.println(list);

        list.reverse();
        System.out.println(list);

        list.add(555);
        System.out.println(list);

        list.add(666);
        System.out.println(list);

        list.reverse();
        System.out.println(list);
    
        list.remove(1);
        System.out.println(list);
    }
}
