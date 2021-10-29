//1. Write a small program that exemplifies the concept of inheritance.
//2. Comment the program accordingly to describe your example.
//3. You should use real-life concepts as classes in the program.
public class Vehicle {
    private int speed;  //Assigning what attributes the class have
    private int seats;
    private String numberPlate;
    private int regNum;
    private String modelName;
    private String color;
    private static int amountOfVehicles = 0;    //Static so it is bound to the class and not the object.
    public Vehicle(int speed, int seats, String numberPlate, int regNum, String modelName, String color) {  //What the user needs to assign as parameter when making a object from class
        this.speed = speed;     //this so it knows it is talking about the object
        this.seats = seats;
        this.numberPlate = numberPlate;
        this.regNum = regNum;
        this.modelName = modelName;
        this.color = color;
        amountOfVehicles++;     //Adds one to the class attribute when an object is created.
    }
    public int getSpeed() {return this.speed;}      //Get methods so child class can get the attributes
    public int getSeats() {return this.seats;}
    public String getNumberPlate() {return this.numberPlate;}
    public int getRegNum() {return this.regNum;}
    public String getModelName() {return this.modelName;}
    public String getColor() {return this.color;}

    @Override
    public String toString() {
        return "Vehicle{" +
                "speed=" + speed +
                ", seats=" + seats +
                ", numberPlate='" + numberPlate + '\'' +
                ", regNum=" + regNum +
                ", modelName='" + modelName + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
class Truck extends Vehicle {
    private int maxLoad;    //Assigning what attributes the child class have
    private int maxSpeed;

    public Truck(int speed, int seats, String numberPlate, int regNum, String modelName, String color, int maxLoad, int maxSpeed) {
        super(speed, seats, numberPlate, regNum, modelName, color);     //importing the attributes from parent class
        this.maxLoad = maxLoad;
        this.maxSpeed = maxSpeed;
    }
    public int getMaxLoad() {return this.maxLoad;}
    public int getMaxSpeed() {return this.maxSpeed;}

    @Override
    public String toString() {
        return "Truck{" +
                "speed=" + getSpeed() + //using the method get in the toString methods since the attributes are private in the parent class.
                ", seats=" + getSeats() +
                ", numberPlate='" + getNumberPlate() + '\'' +
                ", regNum=" + getRegNum() +
                ", modelName='" + getModelName() + '\'' +
                ", color='" + getColor() + '\'' +
                "maxLoad=" + maxLoad +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
class Creator{
    public static void main(String[] args) {
        Truck truck1 = new Truck(0,2,"abc 123",1654987561,"Volvo V90","White", 300000,80);
        Vehicle vehicle1 = new Vehicle(10,5,"313",13575443,"Tesla X","Black");
        System.out.println(truck1);
    }
}