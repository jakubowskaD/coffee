package command;

import coffeMachine.CoffeeMachine;
import coffee.Coffee;
import coffee.TypeOfCoffee;
import container.TypeOfContainer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CreateCoffeeCommand implements Command {
    public Map<TypeOfContainer, Integer> containers = new HashMap<>();

    public CreateCoffeeCommand() {
        containers.put(TypeOfContainer.WATER, 5);
        containers.put(TypeOfContainer.COFFEE, 5);
        containers.put(TypeOfContainer.MILK, 5);
    }

    @Override
    public void run(CoffeeMachine coffeeMachine) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Black\n" +
                "2. Withe\n" +
                "3. Cappuccino\n");
        String coffeeNumber = scanner.nextLine();
        switch (coffeeNumber) {
            case "1":
                makeCoffee(TypeOfCoffee.BLACK.getCoffee());
                break;
            case "2":
                makeCoffee(TypeOfCoffee.WHITE.getCoffee());
                break;
            case "3":
                makeCoffee(TypeOfCoffee.CAPPUCCINO.getCoffee());
                break;
        }

    }

    public void makeCoffee(Coffee coffee) {
        boolean canCoffeeBeMade = true;
        if (containers.get(TypeOfContainer.WATER) - coffee.getUnitOfWater() < 0) {
            canCoffeeBeMade = false;
        }
        if (containers.get(TypeOfContainer.COFFEE) - coffee.getCoffeeBeans() < 0) {
            canCoffeeBeMade = false;
        }
        if (containers.get(TypeOfContainer.MILK) - coffee.getUnitOfMilk() < 0) {
            canCoffeeBeMade = false;
        }
        if (canCoffeeBeMade) {
            Integer waterAmount = containers.get(TypeOfContainer.WATER) - coffee.getUnitOfWater();
            containers.put(TypeOfContainer.WATER, waterAmount);

            Integer coffeeAmount = containers.get(TypeOfContainer.COFFEE) - coffee.getCoffeeBeans();
            containers.put(TypeOfContainer.COFFEE, coffeeAmount);

            Integer milkAmount = containers.get(TypeOfContainer.MILK) - coffee.getUnitOfMilk();
            containers.put(TypeOfContainer.MILK, milkAmount);
        }
    }
}

