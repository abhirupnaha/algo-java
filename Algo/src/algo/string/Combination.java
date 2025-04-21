package algo.string;

class Combination {

    private String st;

    Combination(String st) {
        this.st = st;
    }

    private void print(String elem, int idx) {
        if (idx == st.length()) {
            System.out.println();
            return;
        } 

        String temp;
        int i = idx;
        while (i < st.length()) {
            temp = elem + st.charAt(i);
            System.out.print(temp + " ");
            print(temp, i + 1);
            i ++;
        }
    }

    void printCombination() {
        print("", 0);
    }
}

class TestCombination {
    public static void main(String[] args) {
        (new Combination("abc")).printCombination();
        System.out.println("---------------");
        (new Combination("abcd")).printCombination();
    }
}