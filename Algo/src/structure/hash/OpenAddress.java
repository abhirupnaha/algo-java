package structure.hash;

// implementing double hash open address
// -1 represents empty slot
// -2 represents deleted slot

class OpenAddress {
    private int[] table;
    private int size;

    OpenAddress(int size) {
        this.size = size;

        table = new int[this.size];

        for (int i = 0; i < table.length; i ++)
            table[i] = -1;
    }

    boolean insert(int key) {
        int hash = key % size;
        int offset = (size - 1) - (key % (size - 1));
        int i = 1, probe = hash;

        // iterate unitl empty or deleted slot is present
        while (table[probe] != -1 && table[probe] != -2) {
            // check if key is aready present
            if (table[probe] == key) return false;

            probe = (hash + (i * offset)) % size;
            
            i ++;
            // removing this condition will fill hash table completely.
            // because of this line 97 returns false.
            if (i == size) return false; 
        }

        table[probe] = key;

        return true;
    }

    boolean delete(int key) {
        int hash = key % size;
        int offset = (size - 1) - (key % (size - 1));
        int probe = hash, i = 1;

        while (table[probe] != key) {
            // if empty slot then key not present
            if (table[probe] == -1) return false;

            probe = (hash + (i * offset)) % size;
            
            i ++;
            if (i == size) return false;
        }

        table[probe] = -2;
        
        return true;
    }

    boolean search(int key) {
        int hash = key % size;
        int offset = (size - 1) - (key % (size - 1));
        int probe = hash, i = 1;

        while (table[probe] != key) {
            if (table[probe] == -1) return false;

            probe = (hash + (i * offset)) % size;

            i ++;
            if (i == size) return false;
        }

        return true;
    }

    void printKeys() {
        for (int i : table)
            System.out.print(i + " ");
        System.out.println();
    }
}

class TestOpenAddress {
    public static void main(String[] args) {
        OpenAddress mh = new OpenAddress(7);

        mh.insert(49);
        mh.insert(56);
        mh.insert(72);
        mh.insert(55);
        mh.insert(6);
        mh.insert(64);

        // could not insert 69 
        System.out.println(mh.insert(69)); // false

        mh.printKeys();

        if (mh.search(56))
            System.out.println("yes");
        else
            System.out.println("no");

        mh.delete(56);

        mh.printKeys();

        if (mh.search(56))
            System.out.println("yes");
        else
            System.out.println("no");
    }
}