package ua.dp.mign.datatypes;

class StringPool {
    public static void main(String[] args) {
        String str1 = "in pool";
        String str2 = "in pool";
        String str3 = new String("Not in pool");
        String str4 = new String("Not in pool");

        System.out.println(str1 == str2);
        System.out.println(str1 == "in pool");
        System.out.println(str2 == "in pool");
        System.out.println(str3 == str4);
        System.out.println(str3 == "Not in pool");
        System.out.println(str4 == "Not in pool");
    }
}
