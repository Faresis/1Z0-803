package ua.dp.mign.inheritance;

class SameVariable {
    int state = 8;

    public static void main(String[] args) {
        SameVariable var = new SameVariableEx(9);
        System.out.println(var.state);
        var.printState();
    }

    void printState() {
        System.out.println(this.state);
    }
}

class SameVariableEx extends SameVariable {
    int state = 9;

    SameVariableEx(int st) {
        state = st;
    }

    void printState() {
        System.out.println(this.state);
    }
}
