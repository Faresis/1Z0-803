package ua.dp.mign.casting;

class Casting {
    public static void main(String[] args) {
        A a = new A();
        AI ai = new AI();
        AX ax = new AX();
        A b = new B();
        C c = new C();
        I i = new AI();

        System.out.println("a instance of I = " + (a instanceof I)); 
        System.out.println("ai instance of I = " + (ai instanceof I)); 
        System.out.println("ax instance of I = " + (ax instanceof I)); 

        I iax = (I)ax;

        System.out.println("i to C");
        C ci = (C)i;

        I ia = (I)a;
        I ib = (I)b;
        I ic = (I)c;

        System.out.println("b to B");
        B cb = (B)b;

        System.out.println("a to B");
        B ca = (B)a;
    }
}

class A {
}

class AI extends A implements I {}

class AX extends AI {}

class B extends A {
}

class C {}

interface I {}
