package coffee;

public enum TypeOfCoffee {
    BLACK(new Coffee(3,1,0)),
    WHITE(new Coffee(2,1,1)),
    CAPPUCCINO(new Coffee(1,1,2));

    private final Coffee coffee;

    TypeOfCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    public Coffee getCoffee() {
        return coffee;
    }
}
