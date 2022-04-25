import coffee.Coffee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoffeeMachine {

    public List<Coffee> coffeeList = new ArrayList<>();


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

    public void makeCoffee(){

    }
}
