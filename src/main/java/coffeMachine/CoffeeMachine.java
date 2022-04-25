package coffeMachine;

import coffee.Coffee;
import coffee.TypeOfCoffee;
import command.CleanCommand;
import command.Command;
import command.CreateCoffeeCommand;
import container.Container;
import container.TypeOfContainer;

import java.util.*;

public class CoffeeMachine {


    public Map<String, Command> commands = new HashMap<>();
    public Map<TypeOfContainer, Integer> containers = new HashMap<>();

    public CoffeeMachine(){
        containers.put(TypeOfContainer.WATER, 5);
        containers.put(TypeOfContainer.COFFEE, 5);
        containers.put(TypeOfContainer.MILK, 5);
        commands.put("1", new CreateCoffeeCommand());
        commands.put("2", new CleanCommand());
//        commands.put("3", new FillCommand());
//        commands.put("4", new StateCommand());
//        commands.put("5", new OffCommand());
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu:\n" +
                "1. Coffee\n" +
                "2. Cleaning\n" +
                "3. Fill Container\n" +
                "4. Show state\n" +
                "5. Off\n");
        commands.get(scanner.nextLine()).run(this);
//        String menuNumber = scanner.nextLine();
//        switch (menuNumber){
//            case "1":
//
//                System.out.println("1. Black\n" +
//                        "2. Withe\n" +
//                        "3. Cappuccino\n");
//                String coffeeNumber = scanner.nextLine();
//                switch (coffeeNumber){
//                    case "1":
//                        makeCoffee(TypeOfCoffee.BLACK.getCoffee());
//                        break;
//                    case "2":
//                        makeCoffee(TypeOfCoffee.WHITE.getCoffee());
//                        break;
//                    case "3":
//                        makeCoffee(TypeOfCoffee.CAPPUCCINO.getCoffee());
//                        break;
//                }
//                break;
//            case "2":
//                System.out.println("3.\n" +
//                        "2.\n" +
//                        "1.\n" +
//                        "CLEAN");
//                break;
//            case "3":
//                break;
//            case "4":
//                break;
//            case "5":
//                break;
    }

    public Map<TypeOfContainer, Integer> getContainers() {
        return containers;
    }
}

