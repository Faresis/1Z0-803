package ua.dp.mign.trycatch;

class Ret {
    int foo() {
        int i = 20;
        int[] arr = null;
        try {
            i++;
            arr[0] = i;
            throw new RuntimeException();
        }
        catch(Exception e) {
            return 15;
        }
        finally {
            return 89;
        }
        //return i;
    }

    public static void main(String[] args) {
        Ret r = new Ret();
        System.out.println(r.foo());
    }
}
