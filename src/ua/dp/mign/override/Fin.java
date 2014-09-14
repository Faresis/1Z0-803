package ua.dp.mign.override;

class Fin {
    final void doWork() {
        System.out.println("Fin.doWork");
    }

    public static void main(String[] args) {
        FinEx fix = new FinEx();
        fix.doWork();
    }
}

class FinEx extends Fin {
    void doWork() {
        System.out.println("FinEx.doWork");
    }
}
