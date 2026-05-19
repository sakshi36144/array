package DependenceyInjection;

class Person {

//	Attributes / Properties / Instance var
	int id, age;
	String name, gender;


	public void printDescriptions() {
		System.out.println("Name is : " + name);
		System.out.println("Id is : " + id);
		System.out.println("Age is : " + age);
		System.out.println("Gender is : " + gender);
		System.out.println("--------------------------");

	}

	public void dependencyInjection(int id, String name, int age, String gender) {
		System.out.println(this);
		this.id = id;
		 this.name = name;
		this.age = age;
		this.gender = gender;

	}

}

public class Q1 {

	public static void main(String[] args) {

		Person vikas = new Person();// 1.Obj Creation / Memory Allocation
//		2. Obj Initialization
		vikas.dependencyInjection(6567, "hfhgfdgh", 75643, "llhfhghgk");
		// vikas.id = 101;
		// vikas.name = "Vikas Singh";
		// vikas.age = 44;
		// vikas.gender = "Male";
		
		vikas.printDescriptions();
		System.out.println(vikas);

		Person anoop = new Person();// 1.Obj Creation / Memory Allocation

//		2. Obj Initialization
		anoop.id = 1021;
		anoop.name = "Anoop Singh";
		anoop.age = 44;
		anoop.gender = "Male";
		
		anoop.printDescriptions();

	}

}
