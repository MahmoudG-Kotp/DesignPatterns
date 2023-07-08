package Behaviour.D.State;

public class Silent implements MobileAlertState {
    @Override
    public void alert() {
        System.out.println("Mobile is in silent state");
    }
}
