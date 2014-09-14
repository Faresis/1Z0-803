package ua.dp.mign.datatypes.decimals;

class Decimals {
    public static void main(String[] args) {
        float var = 20.759F;
        double dvar = 1.201762e2F;

        float ivar = 0xaaBBf;
        float ivar2 = 0b11001010101;
        double ivar3 = 0756342;
        System.out.println("var = " + var);
        System.out.println("dvar = " + dvar);
        System.out.println("ivar = " + ivar);
        System.out.println("ivar2 = " + ivar2);
        System.out.println("ivar3 = " + ivar3);
    }
}
