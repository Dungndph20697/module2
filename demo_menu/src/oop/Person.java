package oop;
class Person {
	private String name;
	private int age;

	Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	public Person() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	String sayHello (){
		return "hello "+ name;
	}
}