import coffee.Coffee;
import coffee.TypeOfCoffee;
import container.Container;
import container.TypeOfContainer;

import java.util.*;

public class CoffeeMachine {

    public List<Coffee> coffeeList = new ArrayList<>();
//    public List<Container> containerList = new ArrayList<>();

    public Map<Container, Integer> containers = new HashMap<>();


    public CoffeeMachine(){
        containers.put(new Container(TypeOfContainer.WATER), 5);
        containers.put(new Container(TypeOfContainer.COFFEE), 5);
        containers.put(new Container(TypeOfContainer.MILK), 5);
        coffeeList.add(new Coffee(TypeOfCoffee.BLACK,3,1,0 ));
        coffeeList.add(new Coffee(TypeOfCoffee.WITHE, 2,1,1));
        coffeeList.add(new Coffee(TypeOfCoffee.CAPPUCCINO,1,1,2));

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
                        break;
                    case "2":
                        break;
                    case "3":
                        break;
                }
                break;
            case "2":
                break;
            case "3":
                break;
        }
    }

    public void makeCoffee(TypeOfCoffee typeOfCoffee){
//        Optional<Container> water = containerList.stream()
//                .filter(container -> container.getTypeOfContainer().equals(TypeOfContainer.WATER))
//                .findFirst();

        if (containers.get(TypeOfContainer.WATER)>){

        }
    }

}
