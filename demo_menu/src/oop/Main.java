package oop;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("dung");
        person1.setAge(19);
        System.out.println(person1.getName()+", "+person1.getAge());
        System.out.println(person1.sayHello());

        Person person2 = new Person("dung",20);
    }
}
