package L07.oop.fundamental.Task05MediumProductEncapsulation;

public class Product {

    private final String name;
    private double price;
    private int stock;

    public Product (String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName () {
        return this.name;
    }

    public double getPrice () {
        return this.price;
    }

    public int getStock () {
        return this.stock;
    }


    public void setPrice (double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Invalid value");
        }
    }

    public void setStock (int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("Invalid value");
        }
    }

    public void sell (int quantity) {
        if (quantity <= 0) {
            System.out.println("Invalid quantity.");
            return;
        }

        if (quantity > stock) {
            System.out.println("Not enough stock!");
            return;
        }

        this.stock -= quantity;
    }

    public void summary () {
        System.out.printf("Product name -> %s\nProduct price -> %.2f\nProduct stock -> %d", this.name, this.price, this.stock);
    }

}
