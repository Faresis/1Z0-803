package ua.dp.mign.relational;

class Relational {
    public static void main(String[] args) {
        andOr();
        orAnd();
    }

    private static void andOr() {
        System.out.println("Start And => Or");
        int a = 10;
        int b = 20;
        int c = 30;

        boolean result = a++ == 10 && b++ == 20 || c++ == 30;
        System.out.println("result = " + result);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        
        System.out.println("End And => Or");
    }

    private static void orAnd() {
        System.out.println("Start Or => And");
        int a = 10;
        int b = 20;
        int c = 30;

        boolean result = a++ == 10 || b++ == 20 && c++ == 30;
        System.out.println("result = " + result);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        
        System.out.println("End Or => And");
    }
}
