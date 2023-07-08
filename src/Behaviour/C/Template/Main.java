package Behaviour.C.Template;

public class Main {

    public static void main(String[] args) {
        VehicleTemplate car = new SalonCar();
        car.buildCar();
        System.out.println("------------------------------");
        VehicleTemplate truck = new Truck();
        truck.buildCar();
    }

}
