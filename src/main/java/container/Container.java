package container;

import coffee.Coffee;

public class Container {

    public TypeOfContainer typeOfContainer;
    public static final int CAPACITY = 10;
    protected int actualCapacity;

    public Container(TypeOfContainer typeOfContainer, int actualCapacity) {
        this.typeOfContainer = typeOfContainer;
        this.actualCapacity = actualCapacity;
    }

    public Container(TypeOfContainer typeOfContaine) {
        this.typeOfContainer = typeOfContainer;
    }

    public int getCAPACITY() {
        return CAPACITY;
    }

    public TypeOfContainer getTypeOfContainer() {
        return typeOfContainer;
    }

    public int getActualCapacity() {
        return actualCapacity;
    }

    public void setActualCapacity(int actualCapacity) {
        this.actualCapacity = actualCapacity;
    }

    public boolean isEmpty(){
        return actualCapacity <= 0;
    }
    public int fillContainer() {
        return actualCapacity = 10;
    }

}
