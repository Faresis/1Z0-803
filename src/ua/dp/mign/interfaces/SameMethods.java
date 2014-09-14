package ua.dp.mign.interfaces;

import java.io.*;

class SameMethods implements Interf1, Interf2, Interf1Base, Interf2Base {
    public void method1() {
        System.out.println("Method1");
    }

    public static void main(String[] args) {
        SameMethods var = new SameMethods();
        var.method1();
    }

    public void throwWithoutException() throws Exception {
        System.out.println("No exceptions here");
    }
}

interface Interf1Base {
    void method1() throws Exception;
}

interface Interf2Base {
    void method1() throws Exception;
}

abstract interface Interf1 extends Interf1Base {
    public abstract void method1();
}

interface Interf2 extends Interf2Base {
    void method1() throws IOException;
}

