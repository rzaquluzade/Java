package L07.oop.fundamental.Task05MediumProductEncapsulation;

public class Main {

    public static void main(String[] args) {

        Product pr = new Product("Laptop", 1500, 20);

        pr.getPrice();
        pr.setPrice(2000.0);

        pr.getStock();
        pr.setStock(50);

        pr.sell(15);

        pr.summary();

    }
}
