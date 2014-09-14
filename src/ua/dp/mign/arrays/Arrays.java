package ua.dp.mign.arrays;

class Arrays {
    public static void main(String[] args) {
        int[][] integers = new int[2][];

        System.out.println(integers == null);
        System.out.println(integers[0] == null);
        System.out.println(integers[1] == null);

        System.out.println(integers.length);
    }
}
