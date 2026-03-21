package L03.variables.homework;

public class Task08MediumPermissionFlags {

    public static void main(String[] args) {

        // Sabitler teyin edildi
        final int READ = 1;
        final int WRITE = 2;
        final int EXPORT = 4;
        final int AUDIT = 8;

        int mask = READ | WRITE;
        System.out.println("Başlanğıc mask : " + mask + " -> Binary : " + Integer.toBinaryString(mask));

        boolean canREAD = (mask & READ) != 0;
        boolean canWRITE = (mask & WRITE) != 0;
        boolean canEXPORT = (mask & EXPORT) != 0;
        boolean canAUDIT = (mask & AUDIT) != 0;

        System.out.println("İcazələr :");
        System.out.println("Read : " + canREAD);
        System.out.println("Write : " + canWRITE);
        System.out.println("Export : " + canEXPORT);
        System.out.println("Audit : " + canAUDIT);


        mask |= EXPORT;
        System.out.println("EXPORT əlavə olundu: " + mask + " | Binary: " + Integer.toBinaryString(mask));

        mask &= WRITE;
        System.out.println("WRITE silindi: " + mask + " | Binary: " + Integer.toBinaryString(mask));

        mask ^= AUDIT;
        System.out.println("AUDIT toggle edildi: " + mask + " | Binary: " + Integer.toBinaryString(mask));


        System.out.println("Onluq : " + mask);
        System.out.println("Ikilik : " + Integer.toBinaryString(mask));
    }
}




