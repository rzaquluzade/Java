package L03.variables.homework;

public class Task06MediumOverflowSafety {

    public static void main(String[] args) {

        // Dəyişən təyin edilir
        int packageCounter = Integer.MAX_VALUE - 2;

        // Çıxışa verilir
        System.out.println("Əvvəl : " + packageCounter);

        packageCounter += 1;
        System.out.println("1-ci çıxış : " + packageCounter);

        packageCounter += 1;
        System.out.println("2-ci çıxış : " + packageCounter);

        packageCounter += 1;
        System.out.println("2-ci çıxış : " + packageCounter);

        packageCounter = Integer.MAX_VALUE - 2;

        try {
            packageCounter = Math.addExact(packageCounter, 1);
            System.out.println("AddExact 1 : " + packageCounter);

            packageCounter = Math.addExact(packageCounter, 2);
            System.out.println("AddExact 1 : " + packageCounter);

            packageCounter = Math.addExact(packageCounter, 3);
            System.out.println("AddExact 1 : " + packageCounter);

        } catch (ArithmeticException e) {
            System.out.println("Overflow aşkarlandı : " + e.getMessage());
        }

    }
}
