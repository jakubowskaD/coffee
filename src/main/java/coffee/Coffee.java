package coffee;

public class Coffee {

    private int coffeeBeans;
    private int unitOfWater;
    private int unitOfMilk;

    public Coffee(int coffeeBeans, int unitOfWater, int unitOfMilk) {
        this.coffeeBeans = coffeeBeans;
        this.unitOfWater = unitOfWater;
        this.unitOfMilk = unitOfMilk;
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
