package Inheritance;

class Animal {
	private String name;

	public Animal(String name) {
		this.name = name;
		System.out.println("Animal.Animal()");
	}

	public String getName() {
		return name;
	}

	public void eat() {
		System.out.println(name + " is  eating");
	}

	public void hustle() {
		System.out.println("Animal.hustle()");
	}

	public void sleep() {
		System.out.println("Animal.sleep()");
	}
}

class Tiger extends Animal {
	private String color;

	public Tiger(String name, String color) {
		super(name);
		this.color = color;
		System.out.println("Tiger.Tiger()");
	}

	public String getColor() {
		return color;
	}

	public void hunting() {
		System.out.println("Tiger.hunting " + color);
	}
}

class Cub extends Tiger {
	private int age;

	public Cub(String name, String color, int age) {
		super(name, color);
		this.age = age;
		System.out.println("Cub.Cub()");

	}

	public void print() {
		System.out.println("Name is: " + getName());
		System.out.println("color is: " + getColor());
		System.out.println("age is: " + age);
		System.out.println("---------------------------");
	}

}

public class Inheritance {

	public static void main(String[] args){
		Cub t1 = new Cub("shimbha", "brown", 1);
		t1.hustle();
		t1.hunting();
		t1.eat();
		t1.sleep();
		System.out.println("---------------------------");
		t1.print();

	}

}