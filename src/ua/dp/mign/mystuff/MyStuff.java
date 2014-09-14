package ua.dp.mign;

public class MyStuff {
   MyStuff(String n) { name = n; }
   String name;
   public static void main(String[] args) {
      MyStuff m1 = new MyStuff("guitar");
      MyStuff m2 = new MyStuff("tv");
      System.out.println(m2.equals(m1));
   }
   public boolean equals(Object o) {
      MyStuff m = (MyStuff) o;
      if(m.name != null)
         return true;
      return false;
   }
}
