package ua.dp.mign.override;

class Super {
    void print() {
        System.out.println("Super");
    }

    public static void main(String[] args) {
        Super s = new Derived();
        s.print();
    }
}

class Derived extends Super {
    void print() {
        System.out.println("Derived");
    }

    Derived() {
        super.print();
    }
}
