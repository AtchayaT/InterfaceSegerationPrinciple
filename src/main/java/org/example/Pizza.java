package org.example;

public interface Pizza {



    default double getBasePrice(Boolean veg, Boolean takeAway){
        double basePrice = veg ? 300 : 500;
        double backPackPrice = takeAway ? 20 : 0;
        return basePrice+backPackPrice;
    };

    double getPrice();


}
