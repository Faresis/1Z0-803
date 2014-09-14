package ua.dp.mign.datatypes.integers;

class Integers {
    public static void main(String[] args) {
        byte num = (byte)-1000;
        System.out.println("byte num = " + num);

        long population = 859;
        System.out.println("population = " + population);

        int populationInt = (int)8599999999999999L;
        System.out.println("populationInt = " + populationInt);

        int zero = 0;
        int mzero = -0;
        int pzero = +0;

        System.out.println("zero = " + zero);
        System.out.println("mzero = " + mzero);
        System.out.println("pzero = " + pzero);

        System.out.println("0 == -0 : " + (0 == -0));
        System.out.println("0 == +0 : " + (0 == +0));
    }
}
