package ua.dp.mign.datatypes.character;

class Character {
    public static void main(String[] args) {
        char c1 = 'D';
        System.out.println("c1 = " + c1);
        
        c1 = 122;
        System.out.println("c1 = " + c1);

        int ic1 = c1;
        System.out.println("ic1 = " + ic1);

        char \u0122 = '\u0122';
        System.out.println("\u0122 = " + \u0122);

        char c2 = \u0122;
        System.out.println("c2 = " + c2);

        char c3 = (char)-88888;
        System.out.println("c3 = " + c3);

        char c4 = 0xaB__f;
        System.out.println("c4 = " + c4);

        char c6 = 0b11___011;
        System.out.println("c6 = " + c6);

        char c5 = 01__3071;
        System.out.println("c5 = " + c5);

        System.out.println("c1 = " + ++c1);
        System.out.println("c2 = " + ++c2);
        System.out.println("c3 = " + ++c3);
        System.out.println("c4 = " + ++c4);
        System.out.println("c5 = " + ++c5);
        System.out.println("c6 = " + ++c6);

        char zero = 0;
        char mzero = -0;
        char pzero = +0;

        System.out.println("zero = " + zero);
        System.out.println("mzero = " + mzero);
        System.out.println("pzero = " + pzero);
    }
}
