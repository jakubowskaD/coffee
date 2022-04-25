import coffee.Coffee;
import coffee.TypeOfCoffee;
import container.Container;
import container.TypeOfContainer;

import java.util.*;

public class CoffeeMachine {

//    public List<Coffee> coffeeList = new ArrayList<>();
//    public List<Container> containerList = new ArrayList<>();

    public Map<TypeOfContainer, Integer> containers = new HashMap<>();
    public Map<TypeOfCoffee, Coffee> coffeeMap = new HashMap<>();



    public CoffeeMachine(){
        containers.put(TypeOfContainer.WATER, 5);
        containers.put(TypeOfContainer.COFFEE, 5);
        containers.put(TypeOfContainer.MILK, 5);
        coffeeMap.put(TypeOfCoffee.BLACK, new Coffee(TypeOfCoffee.BLACK,3,1,0 ));
        coffeeMap.put(TypeOfCoffee.WHITE, new Coffee(TypeOfCoffee.WHITE, 2,1,1));
        coffeeMap.put(TypeOfCoffee.CAPPUCCINO, new Coffee(TypeOfCoffee.CAPPUCCINO,1,1,2));

//        containerList.add(new Container(TypeOfContainer.COFFEE));
//        containerList.add(new Container(TypeOfContainer.WATER));
//        containerList.add(new Container(TypeOfContainer.MILK));
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu:\n" +
                "1. Coffee\n" +
                "2. Cleaning\n" +
                "3. Off\n");
        String menuNumber = scanner.nextLine();
        switch (menuNumber){
            case "1":
                System.out.println("1. Black\n" +
                        "2. Withe\n" +
                        "3. Cappuccino\n");
                String coffeeNumber = scanner.nextLine();
                switch (coffeeNumber){
                    case "1":
                        makeCoffee(coffeeMap.get(TypeOfCoffee.BLACK));
                        break;
                    case "2":
                        makeCoffee(coffeeMap.get(TypeOfCoffee.WHITE));
                        break;
                    case "3":
                        makeCoffee(coffeeMap.get(TypeOfCoffee.CAPPUCCINO));
                        break;
                }
                break;
            case "2":
                break;
            case "3":
                break;
        }
    }

    public void makeCoffee(Coffee coffee){
//        Optional<Container> water = containerList.stream()
//                .filter(container -> container.getTypeOfContainer().equals(TypeOfContainer.WATER))
//                .findFirst();
        boolean canCoffeeBeMade = true;
        if (containers.get(TypeOfContainer.WATER) - coffee.getUnitOfWater() < 0){
            canCoffeeBeMade = false;
        }
        if (containers.get(TypeOfContainer.COFFEE) - coffee.getCoffeeBeans() < 0){
            canCoffeeBeMade = false;
        }
        if (containers.get(TypeOfContainer.MILK) - coffee.getUnitOfMilk() < 0){
            canCoffeeBeMade = false;
        }
        if (canCoffeeBeMade){
            Integer waterAmount = containers.get(TypeOfContainer.WATER) - coffee.getUnitOfWater();
            containers.put(TypeOfContainer.WATER, waterAmount);

            Integer coffeAmount = containers.get(TypeOfContainer.COFFEE) - coffee.getCoffeeBeans();
            containers.put(TypeOfContainer.COFFEE, coffeAmount);

            Integer milkAmount = containers.get(TypeOfContainer.MILK) - coffee.getUnitOfMilk();
            containers.put(TypeOfContainer.MILK, milkAmount);
        }


    }

}
