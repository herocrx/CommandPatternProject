import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Command patterm!!");

        Light light = new Light();

        TurnDownCommand turnDownCommand = new TurnDownCommand(light);
        TurnUpCommand   turnUpCommand   = new TurnUpCommand(light);
        TurnOnCommand   turnOnCommand   = new TurnOnCommand(light);
        TurnOffCommand  turnOffCommand  = new TurnOffCommand(light);

        Invoker myInvoker = new Invoker(turnOnCommand,turnOffCommand,turnUpCommand,turnDownCommand);

        for(;;)
        {
            Scanner reader = new Scanner(System.in);  // Reading from System.in
            System.out.println("Enter a number: ");
            System.out.println("1) Turn on a light ");
            System.out.println("2) Turn off a light ");
            System.out.println("3) Turn up a light ");
            System.out.println("4) Turn down a light ");
            int n = reader.nextInt(); // Scans the next token of the input as an int.
            switch(n)
            {
                case 1:
                    myInvoker.clickOn();
                    break;
                case 2:
                    myInvoker.clickOff();
                    break;
                case 3:
                    myInvoker.clickUp();
                    break;
                case 4:
                    myInvoker.clickDown();
                    break;
                default:
                    System.out.println("Unknown input. Try again");
            }

        }




    }
}


