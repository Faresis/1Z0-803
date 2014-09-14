package ua.dp.mign.access;

class StaticNull {
    public static void main(String[] args) {
        A a = null;
        a.doWork();
        System.out.println(a.staticvar);
        System.out.println(a.instancevar);
    }
}

class A {
    public static void doWork() {
        System.out.println("working");
    }

    public static int staticvar = 8;
    public int instancevar;
}
