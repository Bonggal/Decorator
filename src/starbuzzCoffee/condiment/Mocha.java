package starbuzzCoffee.condiment;

import starbuzzCoffee.beverage.Beverage;

public class Mocha extends Condiment{
    public Mocha(Beverage beverage){
        this.condiment = "Mocha";
        this.price = 0.20;
        this.beverage = beverage;
    }
}