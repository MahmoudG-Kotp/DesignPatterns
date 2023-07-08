package Structural.B.Adapter;

class BicycleAdapter implements Vehicle {
    Bicycle bike;

    public BicycleAdapter(Bicycle bike) {
        this.bike = bike;
    }


    @Override
    public void accelerate() {
        bike.pedal();
    }

    @Override
    public void pushBreak() {
        bike.stop();
    }

    @Override
    public void soundHorn() {
        bike.ring();
    }
}
