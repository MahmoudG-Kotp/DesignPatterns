package Behaviour.C.Template;

public class Truck extends VehicleTemplate {
    @Override
    protected void installGearBox() {
        System.out.println("Installing 6 Gear shifts");
    }

    @Override
    protected void assembleComponent() {
        System.out.println("Add extra Truck ");
    }
}
