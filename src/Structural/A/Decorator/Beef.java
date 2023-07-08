package Structural.A.Decorator;

class Beef extends SandwichDecorator{
   public Beef(Sandwich sandwich) {
      super(sandwich);
   }

   @Override
   public int getCost() {
      return super.getCost() + 5;
   }

   @Override
   public String getDescription() {
      return super.getDescription() + ", beef";
   }
}
