package baithuchanh.lopanimalvainterfaceedible.animal;

import baithuchanh.lopanimalvainterfaceedible.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chiken: cluck-cluck";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
