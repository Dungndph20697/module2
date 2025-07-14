package lesson7_abstract;

public class Bird  extends Animal implements  Flyable,Swimmable,Runable {
    @Override
    public void eat() {
        System.out.println("Bird " + getName() + " eat bug");
    }

    @Override
    public void fly() {
        System.out.println("Bird" + getName() + "is flying");
    }

    @Override
    public void swim() {
        System.out.println("Bird " + getName()+ " is swim");
    }

    @Override
    public void run() {
        System.out.println("Bird "+ getName()+ " is run");

    }
}
