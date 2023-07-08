package Behaviour.B.Command;

public class TurnOnTelevision implements Command {
    private Television tv;

    public TurnOnTelevision(Television tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        this.tv.turnOn();
    }

}
