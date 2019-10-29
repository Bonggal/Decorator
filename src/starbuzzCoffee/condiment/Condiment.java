package starbuzzCoffee.condiment;

import starbuzzCoffee.beverage.Beverage;

public abstract class Condiment extends Beverage {
    protected Beverage beverage;
    protected String condiment;
    protected double price;

    public String getDescription() {
        return beverage.getDescription() + " + " + condiment;
    }

    public double getCost() {
        return beverage.getCost() + price;
    }
}