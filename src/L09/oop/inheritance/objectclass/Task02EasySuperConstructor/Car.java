package L09.oop.inheritance.objectclass.Task02EasySuperConstructor;

public class Car extends Vehicle {

    private String model;

    public Car (String brand, int year, String model) {
        super(brand, year);
        this.model = model;
    }

    public void printInfo () {
        System.out.println("Brand : " + brand + "\nYear : " + year + "\nModel : " + model);
    }
}
