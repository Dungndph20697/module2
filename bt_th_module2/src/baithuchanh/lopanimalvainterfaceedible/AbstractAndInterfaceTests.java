package baithuchanh.lopanimalvainterfaceedible;

import baithuchanh.lopanimalvainterfaceedible.animal.Animal;
import baithuchanh.lopanimalvainterfaceedible.animal.Chicken;
import baithuchanh.lopanimalvainterfaceedible.animal.Tiger;
import baithuchanh.lopanimalvainterfaceedible.edible.Edible;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();

        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) {
                Edible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }
        }
    }
}
