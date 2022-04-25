package coffee;

import java.util.List;

public class Coffee {

    TypeOfCoffee typeOfCoffee;
    private int coffeeBeans;
    private int unitOfWater;
    private int unitOfMilk;

    public Coffee(TypeOfCoffee typeOfCoffee, int coffeeBeans, int unitOfWater, int unitOfMilk) {
        this.typeOfCoffee = typeOfCoffee;
        this.coffeeBeans = coffeeBeans;
        this.unitOfWater = unitOfWater;
        this.unitOfMilk = unitOfMilk;
    }

    public TypeOfCoffee getTypeOfCoffee() {
        return typeOfCoffee;
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public void setCoffeeBeans(int coffeeBeans) {
        this.coffeeBeans = coffeeBeans;
    }

    public int getUnitOfWater() {
        return unitOfWater;
    }

    public void setUnitOfWater(int unitOfWater) {
        this.unitOfWater = unitOfWater;
    }

    public int getUnitOfMilk() {
        return unitOfMilk;
    }

    public void setUnitOfMilk(int unitOfMilk) {
        this.unitOfMilk = unitOfMilk;
    }

}
