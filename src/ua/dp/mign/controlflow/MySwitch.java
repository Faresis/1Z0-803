package ua.dp.mign.controlflow;

class MySwitch {
    public static void main(String[] args) {
        String var = "3";

        switch(var) {
            default:
                System.out.println("default");
            case "1":
                System.out.println("1");
            case "2":
                System.out.println("2");
            case "3":
                System.out.println("3");
        }
    }
}
