package ua.dp.mign.access;

abstract public class AccessNonAccess {
    static public void main(String[] args) {
    }

    final static public int constant = 20;

    abstract public int getValue();

    final static public int getValue2() {
        return 4;
    }
}
