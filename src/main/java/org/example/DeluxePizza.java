package org.example;

public class DeluxePizza implements Pizza{

    private final static int extraCheesePrice = 100;
    private final static int extraToppingsPrice = 150;
    private final double price;

    public DeluxePizza(Boolean type, Boolean takeAway) {
        this.price = getBasePrice(type, takeAway); // Using interface default method
    }

    @Override
    public double getPrice() {
        return price + extraCheesePrice + extraToppingsPrice;
    }
}
