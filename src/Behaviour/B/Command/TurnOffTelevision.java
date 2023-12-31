package Behaviour.B.Command;

public class TurnOffTelevision implements Command {
    private Television tv;

    public TurnOffTelevision(Television tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        this.tv.turnOff();
    }

}
