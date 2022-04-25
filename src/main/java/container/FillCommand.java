package container;

import coffeMachine.CoffeeMachine;
import command.Command;

import java.util.Scanner;

public class FillCommand implements Command {

    private final int CAPACITY = 10;

    @Override
    public void run(CoffeeMachine coffeeMachine) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Water\n" +
                "2. Coffee Beans\n" +
                "3. Milk\n");
        String container = scanner.nextLine();
        switch (container) {
            case "1":
                fillContainer(TypeOfContainer.WATER, coffeeMachine);
                break;
            case "2":
                fillContainer(TypeOfContainer.COFFEE, coffeeMachine);
                break;
            case "3":
                fillContainer(TypeOfContainer.MILK, coffeeMachine);
                break;
        }
    }
    public void fillContainer(TypeOfContainer typeOfContainer, CoffeeMachine coffeeMachine) {
        coffeeMachine.getContainers().put(typeOfContainer, CAPACITY);
    }
}
