package l07.oop.fundamental.Task04EasyCarController;

public class Car {

    private final String brand;
    private int speed;
    private int maxSpeed;

    public Car(String brand, int maxSpeed) {
        this.brand = brand;
        this.speed = 0;
        this.maxSpeed = maxSpeed;
    }

    public void accelerate(int delta) {
        System.out.println("Normal speed : " + this.speed);
        this.speed += delta;

        if (this.speed > this.maxSpeed) {
            this.speed = this.maxSpeed;
        }
        System.out.println("Increasing speed : " + this.speed);
    }

    public void brake(int delta) {
        System.out.println("Increasing speed : " + this.speed);
        this.speed -= delta;

        if (this.speed < 0) {
            this.speed = 0;
        }
        System.out.println("Decreasing speed : " + this.speed);
    }
}
