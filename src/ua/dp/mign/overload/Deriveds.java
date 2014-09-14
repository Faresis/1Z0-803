package ua.dp.mign.overload;

class Deriveds {
    void doWork(String val) {
        System.out.println("doWork(String)");
    }
    void doWork(Object val) {
        System.out.println("doWork(Object)");
    }
    /*void doWork(Deriveds val) {
        System.out.println("doWork(Deriveds)");
    }*/
    /*void doWork(int val) {
        System.out.println("doWork(int)");
    }*/
    void doWork(long val) {
        System.out.println("doWork(long)");
    }

    public static void main(String[] args) {
        Deriveds d = new Deriveds();

        d.doWork(null);
        d.doWork("Hello");
        Object o = "Some val";
        d.doWork(o);

        char c = '1';
        d.doWork(c);
    }
}
