import java.util.Scanner;

public class Rooftop {
    public static double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
        return morningEnergy + eveningEnergy;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 2a) Data Types
        int panelId;
        double energyGenerated;
        int numberOfPanels;
        char systemStatus;

        System.out.print("Enter Panel ID: ");
        panelId = sc.nextInt();

        System.out.print("Enter Energy Generated in kWh: ");
        energyGenerated = sc.nextDouble();

        System.out.print("Enter Number of Solar Panels: ");
        numberOfPanels = sc.nextInt();

        System.out.print("Enter System Status (A/I): ");
        systemStatus = sc.next().charAt(0);

        System.out.println("\n--- Rooftop Solar System Details ---");
        System.out.println("Panel ID: " + panelId);
        System.out.println("Energy Generated: " + energyGenerated + " kWh");
        System.out.println("Number of Solar Panels: " + numberOfPanels);
        System.out.println("System Status: " + systemStatus);

        // 2b) If-Else Condition
        if (energyGenerated >= 10) {
            System.out.println("Good Energy Generation");
        } else {
            System.out.println("Low Energy Generation");
        }

        // 2c) Methods
        System.out.print("\nEnter Morning Energy in kWh: ");
        double morningEnergy = sc.nextDouble();

        System.out.print("Enter Evening Energy in kWh: ");
        double eveningEnergy = sc.nextDouble();

        double totalEnergy = calculateTotalEnergy(morningEnergy, eveningEnergy);

        System.out.println("Total Energy Generated: " + totalEnergy + " kWh");

        sc.close();
    }
}
