package ua.dp.mign.constructor;

class Recurse {
    int age;
    String name;

    Recurse() {
        this();
    }

    Recurse(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
