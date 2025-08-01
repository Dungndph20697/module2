package lesson7_abstract;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void eat();
}
