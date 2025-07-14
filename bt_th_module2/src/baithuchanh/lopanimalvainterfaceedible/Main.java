package baithuchanh.lopanimalvainterfaceedible;

import baithuchanh.lopanimalvainterfaceedible.fruit.Apple;
import baithuchanh.lopanimalvainterfaceedible.fruit.Fruit;
import baithuchanh.lopanimalvainterfaceedible.fruit.Orange;

public class Main {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }

    }
}
