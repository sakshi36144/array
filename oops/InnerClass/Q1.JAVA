

public class Q1 {

	class Personn {

//		Attributes / Properties / Instance var
		private int id, age;
		private String name, gender;

		public void eat() {
			// generated the error is null pointer exception 
            // System.out.println(name.charAt(0) + " can eat............\n");
			//  generated the error because name is not initialized yet, so we will initialize it in main method and then call eat method
		}

		public void printDescriptions() {
			System.out.println("Name is : " + name);
			System.out.println("Id is : " + id);
			System.out.println("Age is : " + age);
			System.out.println("Gender is : " + gender);
			System.out.println("--------------------------");

		}

	}
	
	public void sweet() {
		System.out.println("Name is : " + name);
		System.out.println("Id is : " + id);
		System.out.println("Age is : " + age);
		System.out.println("Gender is : " + gender);
		System.out.println("--------------------------");
		
		
	}
	public static void main(String[] args) {
		
		Q1 oj =  new Q1();

		Q1.Personn vikas = oj.new Personn();// 1.Obj Creation / Memory Allocation

//		2. Obj Initialization
		vikas.id = 101;
		vikas.name = "Vikas Singh";
		vikas.age = 44;
		vikas.gender = "Male";
		vikas.printDescriptions();

		Personn anoop = new Personn();// 1.Obj Creation / Memory Allocation

//		2. Obj Initialization
		anoop.id = 1021;
		anoop.name = "Anoop Singh";
		anoop.age = 44;
		anoop.gender = "Male";
		anoop.printDescriptions();

	}

}