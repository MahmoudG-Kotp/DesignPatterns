package Structural.A.Decorator;

class Cheese extends SandwichDecorator{

   public Cheese(Sandwich sandwich) {
      super(sandwich);
   }

   @Override
   public int getCost() {
      return super.getCost() + 2;
   }

   @Override
   public String getDescription() {
      return super.getDescription() + ", cheese";
   }
}
