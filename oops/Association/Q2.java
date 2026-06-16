package Association;

class Car {

    String name;
    Driver driver;

    final Engine engine;

    public Car() {
        engine = new Engine(2222, 3333);
        System.out.println("Car.Car()");
    }

    @Override
    public String toString() {
        return "Car [name=" + name +
                ", driver=" + driver +
                ", engine=" + engine + "]";
    }
}

class Engine {

    int hp, torque;

    public Engine(int hp, int torque) {
        this.hp = hp;
        this.torque = torque;
        System.out.println("Car.Engine()");
    }

    @Override
    public String toString() {
        return "Engine [hp=" + hp + ", torque=" + torque + "]";
    }
}

class Driver {

    private String empName;
    private String address;

    public Driver(String empName, String address) {
        this.empName = empName;
        this.address = address;
        System.out.println("Car.Driver()");
    }

    @Override
    public String toString() {
        return "Driver [empName=" + empName +
                ", address=" + address + "]";
    }
}

public class Q2 {

    public static void main(String[] args) {

        Driver krishna = new Driver("Madhav", "Dwarika");

        Car c1 = new Car();

        c1.driver =krishna;
        c1.name="Scorpio";
          System.out.println(c1);
    }
}