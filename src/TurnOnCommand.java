public class TurnOnCommand implements ICommand{

    private Light light;

    public TurnOnCommand(final Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void unexecute() {

    }
}
