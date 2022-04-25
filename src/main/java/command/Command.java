package command;

import coffeMachine.CoffeeMachine;

public interface Command {
    void run(CoffeeMachine coffeeMachine);

}

