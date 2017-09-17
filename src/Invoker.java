
import java.util.List;
import java.util.ArrayList;


public class Invoker {

    private ICommand on;
    private ICommand off;
    private ICommand up;
    private ICommand down;

    private List<ICommand> history = new ArrayList<ICommand>();
    int sizeHistory;

    public Invoker(ICommand on,ICommand off,ICommand up,ICommand down ) {
        this.on = on;
        this.off = off;
        this.up = up;
        this.down = down;
        sizeHistory = 0;
    }
    public void clickOn()
    {
        history.add(on);
        this.on.execute();
    }

    public void clickOff()
    {
        this.off.execute();
    }

    public void clickUp()
    {
      this.up.execute();
    }

    public void clickDown()
    {
        this.down.execute();
    }
}
