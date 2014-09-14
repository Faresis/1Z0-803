package ua.dp.mign.inheritance;

public class Access extends Base {
    public Access someMethod(Base b) {
        System.out.println("Access");
        return this;
    }

    public static void main(String[] args) {
        Base b = new Access();
        b.someMethod(new Base());
    }
}

class SuperBase {
    protected SuperBase someMethod(Base b) {
        System.out.println("SuperBase");
        return this;
    }
}

class Base extends SuperBase {
    protected Base someMethod(Base b) {
        System.out.println("Base");
        return this;
    }
}
