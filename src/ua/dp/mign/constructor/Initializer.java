package ua.dp.mign.constructor;

class Initializer {
    {
        System.out.println("Block 2");
    }

    Initializer() {
        System.out.println("Constructor 1");
    }

    {
        System.out.println("Block 1");
    }

    {
        System.out.println("Block 3");
    }


    public static void main ( String[] args ) {
        Initializer i = new Initializer();
    }
}
