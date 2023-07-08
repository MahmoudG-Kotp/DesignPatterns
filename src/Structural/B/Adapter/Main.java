package Structural.B.Adapter;
/*Design style make you able to connect two different classes through Adapter class*/

class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        useVehicle(car);

        BicycleAdapter bikeAdapter = new BicycleAdapter(new Bicycle());
        useVehicle(bikeAdapter);

    }

    private static void useVehicle(Vehicle vehicle) {
        vehicle.accelerate();
        vehicle.pushBreak();
        vehicle.soundHorn();
        System.out.println("\n");
    }


}
