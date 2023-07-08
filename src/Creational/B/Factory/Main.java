package Creational.B.Factory;
/* Type of creational designs which provides ability to pass newly created object without
   exposing the creation logic and duplicate same features */
public class Main {
   public static void main(String[] args) {
      Sandwich sandwich1 = SandwichFactory.createSandwich(SandwichFactory.CHEESE_BURGER);
      Sandwich sandwich2 = SandwichFactory.createSandwich(SandwichFactory.CHICKEN_BURGER);

      sandwich1.prepare();
      sandwich2.prepare();
   }
}
