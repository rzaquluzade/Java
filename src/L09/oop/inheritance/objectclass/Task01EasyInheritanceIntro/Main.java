package L09.oop.inheritance.objectclass.Task01EasyInheritanceIntro;

public class Main {

    public static void main(String[] args) {

        Person p = new Person("Rza", 25);
        Student s = new Student("Rza", 25, "IT");

        p.printInfo();
        System.out.println();
        s.printInfo();

    }
}
