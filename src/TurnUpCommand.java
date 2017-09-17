public class TurnUpCommand implements ICommand
{
    private Light light;

    public TurnUpCommand(final Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.up();
    }

    @Override
    public void unexecute() {

    }
}
