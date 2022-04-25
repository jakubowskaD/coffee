package command;

import coffeMachine.CoffeeMachine;
import container.TypeOfContainer;

public class CleanCommand implements Command{

    private final int UNIT_OF_WATER = 2;

    @Override
    public void run(CoffeeMachine coffeeMachine) {
        System.out.println("3.\n" +
                        "2.\n" +
                        "1.\n" +
                        "CLEAN");

        boolean canCleanMachine = true;
        if (coffeeMachine.getContainers().get(TypeOfContainer.WATER) - UNIT_OF_WATER < 0){
            canCleanMachine = false;
            System.out.println("Fill water container");
        }
        if (canCleanMachine) {
            Integer waterAmount = coffeeMachine.getContainers().get(TypeOfContainer.WATER) - UNIT_OF_WATER;
            coffeeMachine.getContainers().put(TypeOfContainer.WATER,waterAmount);
        }
    }
}
