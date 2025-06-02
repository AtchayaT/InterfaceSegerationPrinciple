package org.example;

public class NormalPizza implements Pizza{

    private final double price;

    public NormalPizza(Boolean type, Boolean takeAway) {
        this.price = getBasePrice(type, takeAway); // Using interface default method
    }

    @Override
    public double getPrice() {
        return price;
    }

}
