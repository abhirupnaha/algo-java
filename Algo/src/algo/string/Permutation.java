package algo.string;

class Permutation {
    
    private String swap(String st, int i, int j) {
        if (i == j) return st;

        char[] a = st.toCharArray();
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;

        return new String(a);
    }

    private void print(String st, int pos) {
        if (pos == (st.length() - 1)) {
            System.out.println(st);
            return;
        }

        int i = pos;
        while (i < st.length()) {
            print(swap(st, pos, i), pos + 1);
            i ++;
        }
    }

    void print(String st) {
        print(st, 0);
    }
}

class TestPermutation {
    public static void main(String[] args) {
        (new Permutation()).print("abc");
    }
}