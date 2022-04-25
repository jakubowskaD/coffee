package coffee;

public class Coffee {

    private final int coffeeBeans;
    private final int unitOfWater;
    private final int unitOfMilk;

    public Coffee(int coffeeBeans, int unitOfWater, int unitOfMilk) {
        this.coffeeBeans = coffeeBeans;
        this.unitOfWater = unitOfWater;
        this.unitOfMilk = unitOfMilk;
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public int getUnitOfWater() {
        return unitOfWater;
    }

    public int getUnitOfMilk() {
        return unitOfMilk;
    }


}
