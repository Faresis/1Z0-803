package ua.dp.mign.override;

import java.io.*;

class Throwing {
    public static void main(String[] args) {
        A c = new C();
    }
}

class A {
    void doWork() throws IOException {}
}

class B extends A {
    void doWork() throws FileNotFoundException, NullPointerException, StackOverflowError {}
}

class C extends B {
    void doWork() throws RuntimeException {}
}
