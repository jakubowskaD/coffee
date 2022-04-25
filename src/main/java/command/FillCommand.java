package command;

import coffeMachine.CoffeeMachine;
import container.TypeOfContainer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FillCommand implements Command {

    private final int CAPACITY = 10;
    public Map<String, TypeOfContainer> containers = new HashMap<>();

    public FillCommand() {
        containers.put("1", TypeOfContainer.WATER);
        containers.put("2", TypeOfContainer.COFFEE);
        containers.put("3", TypeOfContainer.MILK);
    }

    @Override
    public void run(CoffeeMachine coffeeMachine) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Water\n" +
                "2. Coffee Beans\n" +
                "3. Milk\n");
        String container = scanner.nextLine();
        fillContainer(containers.get(container),coffeeMachine);
        }

    public void fillContainer(TypeOfContainer typeOfContainer, CoffeeMachine coffeeMachine) {
        coffeeMachine.getContainers().put(typeOfContainer, CAPACITY);
        System.out.println(typeOfContainer + " container full " + coffeeMachine.getContainers().get(typeOfContainer) + "/10");
    }
}
