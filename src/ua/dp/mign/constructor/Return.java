package ua.dp.mign.constructor;

class Return {
    Return(int i) {
        System.out.println("Entering constructor.");
        if(i>0)
            return; 
        System.out.println("Exiting constructor.");
    }

    public static void main(String[] args) {
        Return r = new Return(-1);
        Return r2 = new Return(1);
    }
}
