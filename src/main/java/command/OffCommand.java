package command;

import coffeMachine.CoffeeMachine;

public class OffCommand implements Command{

    @Override
    public void run(CoffeeMachine coffeeMachine) {
        System.exit(0);
    }
}
