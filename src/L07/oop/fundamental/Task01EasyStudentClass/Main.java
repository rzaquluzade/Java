package L07.oop.fundamental.Task01EasyStudentClass;

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student("Ali", 15, "IT");
        Student s2 = new Student("Veli", 16, "IT");

        s1.printInfo();
        System.out.println();
        s2.printInfo();
    }
}
