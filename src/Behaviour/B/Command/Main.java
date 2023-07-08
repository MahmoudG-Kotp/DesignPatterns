package Behaviour.B.Command;

class Main {
    public static final int TV_SLOT = 0;
    public static final int RECEIVER_SLOT = 1;
    public static final int MEDIA_PLAYER_SLOT = 2;

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Television tv = new Television();
        TurnOnTelevision turnOnTelevision = new TurnOnTelevision(tv);
        TurnOffTelevision turnOffTelevision = new TurnOffTelevision(tv);

        remoteControl.addCommand(TV_SLOT, turnOnTelevision, turnOffTelevision);

        remoteControl.onButtonPressed(TV_SLOT);
        remoteControl.offButtonPressed(TV_SLOT);
    }
}
