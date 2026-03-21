package L03.variables.homework;

public class Task07MediumCastingData {

    public static void main(String[] args) {

        double value1 = 158.47;
        int value2 = (int)value1;

        int value3 = 78;
        byte value4 =(byte)value3;

        byte sensor1 = 75;
        byte sensor2 = 50;

        int sumInt = sensor1 + sensor2;
        byte sumByte = (byte) sumInt;

        System.out.println("double -> int : " + value1 + " -> " + value2);
        System.out.println("int -> byte : " + value3 + " -> " + value4);
        System.out.println("sensor1 : " + sensor1 + "\nsensor2 : " + sensor2);
        System.out.println("Sum Int : " + sumInt);
        System.out.println("Sum Byte : " + sumByte);

    }
}
