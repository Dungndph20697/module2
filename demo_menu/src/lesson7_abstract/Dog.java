package lesson7_abstract;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("Dog" + getName() + " eat xuong");
    }
}
