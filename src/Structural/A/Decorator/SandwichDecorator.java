package Structural.A.Decorator;

class SandwichDecorator implements Sandwich {
   private Sandwich sandwich;

   public SandwichDecorator(Sandwich sandwich){
      this.sandwich = sandwich;
   }

   @Override
   public int getCost() {
      return this.sandwich.getCost();
   }

   @Override
   public String getDescription() {
      return this.sandwich.getDescription();
   }
}
