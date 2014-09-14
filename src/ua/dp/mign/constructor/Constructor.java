package ua.dp.mign.constructor;

class Constructor {
    int age;
    Constructor(int age) {
        this.age = age;
    }

    String Constructor(int age) {
        this.age = age;
        return "";
    }

    public static void main(String[] args) {
        Constructor c = new Constructor(4);
        c.Constructor(5);
        System.out.println(c.age);
    }
}
