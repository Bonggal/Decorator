package starbuzzCoffee;

import starbuzzCoffee.beverage.Beverage;
import starbuzzCoffee.beverage.Espresso;
import starbuzzCoffee.beverage.HouseBlend;
import starbuzzCoffee.condiment.Milk;
import starbuzzCoffee.condiment.Mocha;

public class MainProgram {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        espresso = new Milk(espresso);
        espresso = new Milk(espresso);

        System.out.println("Beverage: " + espresso.getDescription());
        System.out.println("Cost: " + espresso.getCost() + "\n");

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Milk(houseBlend);
        houseBlend = new Mocha(houseBlend);

        System.out.println("Beverage: " + houseBlend.getDescription());
        System.out.println("Cost: " + houseBlend.getCost() + "\n");
    }
}