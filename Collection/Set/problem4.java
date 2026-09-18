// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.ArrayList;
import java.util.HashSet;

public class problem4 {
   public problem4() {
   }

   public static void main(String[] var0) {
      ArrayList<Integer> var1 = new ArrayList<>();
      var1.add(23);
      var1.add(24);
      var1.add(25);
      var1.add(26);
      var1.add(24);
      var1.add(23);
      System.out.println("Marks 1 List" + String.valueOf(var1));
      HashSet<Integer> var2 = new HashSet<>(var1);

    /*   for(int var4 : var1) {
         var2.add(var4);
      } */

      System.out.println("Set List Marks " + String.valueOf(var2));
   }
}
