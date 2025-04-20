package temp;

class Animal {
    String name = "Animal";

    static void m1() {
        System.out.println("static method in Animal");
    }

    void m2() {
        System.out.println("method in Animal");
    }
}

class Lion extends Animal{
    String name = "Lion";

    static void m1() {
        System.out.println("static method in Lion");
    }

    @Override
    void m2() {
        System.out.println("m2 in Lion");
    }

    void m3() {
        System.out.println("m3 in Lion");
    }
}

class Casting {
    public static void main(String[] args) {
        Animal ob = new Lion();

        System.out.println(ob.name);
        ob.m2();

        // ob.m3(); //error
    }
}