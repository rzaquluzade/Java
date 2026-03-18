package L03.variables.homework;

public class Task03EasyFuelUsage {

    public static void main(String[] args) {

        // Məsafə və yanacaq
        int distanceKm = 8;
        double fuelLiters = 39;

        // Sərfiyyat
        double litersPer100Km = (fuelLiters / fuelLiters) * 100;

        // Qiymet
        double pricePerliter = 1.6;
        double estimatedTripCost = fuelLiters * pricePerliter;

        // Çıxış
        System.out.printf("Distance : %d km\n", distanceKm);
        System.out.printf("Fuel used : %.2f liters\n", fuelLiters);
        System.out.printf("Cunsumption : %.2f liters/100km\n", litersPer100Km);
        System.out.printf("Price per liter : $%.2f \n", pricePerliter);
        System.out.printf("Estimated trip cost : $%.2f \n", estimatedTripCost);

    }
}
