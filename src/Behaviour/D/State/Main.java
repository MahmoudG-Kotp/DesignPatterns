package Behaviour.D.State;

class Main {
   public static void main(String[] args) {
      MobileContext context = new MobileContext();
      context.alert();
      context.setState(new Silent());
      context.alert();
   }
}
