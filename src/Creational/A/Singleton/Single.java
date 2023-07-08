package Creational.A.Singleton;

public class Single {
   private static int counter = 0;
   private static Single instance;

   public static Single getInstance() {
      if (instance == null)
         instance = new Single();
      return instance;
   }

   private Single() {
      System.out.println(hashCode());
      System.out.println(counter++);
   }
}
