public class TurnOffCommand implements ICommand {

    private Light light;

    public TurnOffCommand(final Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void unexecute() {

    }
}
