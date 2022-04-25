package command;

import coffeMachine.CoffeeMachine;
import coffee.Coffee;
import coffee.TypeOfCoffee;
import container.TypeOfContainer;

import java.util.Scanner;

public class CreateCoffeeCommand implements Command {


    public CreateCoffeeCommand() {
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
                makeCoffee(TypeOfCoffee.BLACK.getCoffee(), coffeeMachine);
                break;
            case "2":
                makeCoffee(TypeOfCoffee.WHITE.getCoffee(), coffeeMachine);
                break;
            case "3":
                makeCoffee(TypeOfCoffee.CAPPUCCINO.getCoffee(), coffeeMachine);
                break;
        }

    }

    public void makeCoffee(Coffee coffee, CoffeeMachine coffeeMachine) {
        boolean canCoffeeBeMade = true;
        if (coffeeMachine.getContainers().get(TypeOfContainer.WATER) - coffee.getUnitOfWater() < 0) {
            canCoffeeBeMade = false;
            System.out.println("Fill water container");
        }
        if (coffeeMachine.getContainers().get(TypeOfContainer.COFFEE) - coffee.getCoffeeBeans() < 0) {
            canCoffeeBeMade = false;
            System.out.println("Fill coffee container");
        }
        if (coffeeMachine.getContainers().get(TypeOfContainer.MILK) - coffee.getUnitOfMilk() < 0) {
            canCoffeeBeMade = false;
            System.out.println("Fill milk container");
        }
        if (canCoffeeBeMade) {
            Integer waterAmount = coffeeMachine.getContainers().get(TypeOfContainer.WATER) - coffee.getUnitOfWater();
            coffeeMachine.getContainers().put(TypeOfContainer.WATER, waterAmount);

            Integer coffeeAmount = coffeeMachine.getContainers().get(TypeOfContainer.COFFEE) - coffee.getCoffeeBeans();
            coffeeMachine.getContainers().put(TypeOfContainer.COFFEE, coffeeAmount);

            Integer milkAmount = coffeeMachine.getContainers().get(TypeOfContainer.MILK) - coffee.getUnitOfMilk();
            coffeeMachine.getContainers().put(TypeOfContainer.MILK, milkAmount);

            System.out.println("coffee ready");
        }
    }
}

