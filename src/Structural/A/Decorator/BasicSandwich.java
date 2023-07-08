package Structural.A.Decorator;

class BasicSandwich implements Sandwich{
   @Override
   public int getCost() {
      return 10;
   }

   @Override
   public String getDescription() {
      return "Bread";
   }
}
