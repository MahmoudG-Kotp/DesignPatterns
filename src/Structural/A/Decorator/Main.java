package Structural.A.Decorator;
/* Allows to override new values and features to an individual object without affecting other objects*/
class Main {
   public static void main(String[] args) {
      Sandwich mySandwich = new Cheese(new Beef(new BasicSandwich()));
      System.out.println("Description = " + mySandwich.getDescription());
      System.out.println("Cost = " + mySandwich.getCost());
   }
}
