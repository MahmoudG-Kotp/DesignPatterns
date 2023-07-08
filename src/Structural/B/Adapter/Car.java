package Structural.B.Adapter;

class Car implements Vehicle{
   @Override
   public void accelerate() {
      System.out.println("Car Moving Forward...");
   }

   @Override
   public void pushBreak() {
      System.out.println("Car Stopping...");
   }

   @Override
   public void soundHorn() {
      System.out.println("Beeb Beeb...");
   }
}
