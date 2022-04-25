package coffeMachine;

import command.*;
import command.FillCommand;
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
        commands.put("3", new FillCommand());
        commands.put("4", new StateCommand());
        commands.put("5", new OffCommand());
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        boolean working = true;
        while (working){
            System.out.println("\nMenu:\n" +
                    "1. Coffee\n" +
                    "2. Cleaning\n" +
                    "3. Fill Container\n" +
                    "4. Show state\n" +
                    "5. Off\n");
            commands.get(scanner.nextLine()).run(this);
        }
    }

    public Map<TypeOfContainer, Integer> getContainers() {
        return containers;
    }
}

