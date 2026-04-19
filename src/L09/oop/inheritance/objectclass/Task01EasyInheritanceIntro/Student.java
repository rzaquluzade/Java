package L09.oop.inheritance.objectclass.Task01EasyInheritanceIntro;

public class Student extends Person {

    private String  group;

    public Student (String name, int age, String group) {
        super(name, age);
        this.group = group;
    }

    @Override
    public void printInfo () {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Group : " + group);
    }
}

