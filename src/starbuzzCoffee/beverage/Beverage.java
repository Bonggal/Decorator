package starbuzzCoffee.beverage;

public abstract class Beverage {
    protected String description;
    protected double cost;

    public double getCost(){
        return this.cost;
    }

    public String getDescription(){
        return this.description;
    }
}