package Creational.A.Singleton;

/* Type of creational design pattern, returns single object of the class to avoid it to run more than once*/

public class Main {
   public static void main(String[] args) {
      Single A = Single.getInstance();
      Single B = Single.getInstance();
   }
}
