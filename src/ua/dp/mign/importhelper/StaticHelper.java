package ua.dp.mign.importhelper;

public class StaticHelper {
    public static void doJob() { System.out.println("say StaticHelper.doJob"); }

    public static int getState(StaticHelper object) {
       return object._state;
    }

    private int _state;
}
