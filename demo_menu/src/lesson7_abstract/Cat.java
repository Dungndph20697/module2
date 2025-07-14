package lesson7_abstract;

public class Cat extends Animal{

    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Cat " + getName() + " eat fish");
    }
}
