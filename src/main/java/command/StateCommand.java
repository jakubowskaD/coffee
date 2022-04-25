package command;

import coffeMachine.CoffeeMachine;
import container.TypeOfContainer;

public class StateCommand implements Command{

    @Override
    public void run(CoffeeMachine coffeeMachine) {
        System.out.println("Coffee beans: " + coffeeMachine.getContainers().get(TypeOfContainer.COFFEE) + "/10");
        System.out.println("Water container: " + coffeeMachine.getContainers().get(TypeOfContainer.WATER) + "/10");
        System.out.println("Milk container: " + coffeeMachine.getContainers().get(TypeOfContainer.MILK) + "/10");
    }
}
