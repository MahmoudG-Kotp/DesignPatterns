package Creational.B.Factory;

class SandwichFactory {
    public static final int CHEESE_BURGER = 1, CHICKEN_BURGER = 2;

    public static Sandwich createSandwich(int sandwichID) {
        switch (sandwichID) {
            case CHEESE_BURGER:
                return new CheeseBurger();

            case CHICKEN_BURGER:
                return new ChickenBurger();

            default:
                return null;
        }
    }
}
