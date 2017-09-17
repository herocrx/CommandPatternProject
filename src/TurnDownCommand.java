public class TurnDownCommand implements ICommand{
    private Light light;

    public TurnDownCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.down();
    }

    @Override
    public void unexecute() {

    }
}
