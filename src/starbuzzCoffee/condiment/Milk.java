package starbuzzCoffee.condiment;

import starbuzzCoffee.beverage.Beverage;

public class Milk extends Condiment {
    public Milk(Beverage beverage) {
        this.beverage = beverage;
        this.price = 0.10;
        this.condiment = "Milk";
    }
}