package ua.dp.mign.constructor;

class Circular {
    Circular() {
        this(5, "hello");
    }
    Circular(int age, String name) {
        this();
        this.age = age;
        this.name = name;
    }

    int age;
    String name;

}
