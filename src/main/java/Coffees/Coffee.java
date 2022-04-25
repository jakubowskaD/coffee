package Coffees;

public abstract class Coffee {

    TypeOfCoffee typeOfCoffee;
    int coffeeBeans;
    int unitOfWater;
    int unitOfMilk;

    public Coffee(TypeOfCoffee typeOfCoffee, int coffeeBeans, int unitOfWater, int unitOfMilk) {
        this.typeOfCoffee = typeOfCoffee;
        this.coffeeBeans = coffeeBeans;
        this.unitOfWater = unitOfWater;
        this.unitOfMilk = unitOfMilk;
    }
}
