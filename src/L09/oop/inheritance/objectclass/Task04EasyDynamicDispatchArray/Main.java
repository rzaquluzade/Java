package L09.oop.inheritance.objectclass.Task04EasyDynamicDispatchArray;

public class Main {

    public static void main(String[] args) {

       Animal[] animals = new Animal[2];

       animals[0] = new Cat();
       animals[1] = new Dog();

       for (Animal a : animals) {
           System.out.println("Class : " + a.getClass().getSimpleName());
           a.sound();
           System.out.println();
       }
    }
}
