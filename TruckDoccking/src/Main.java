import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DockStation[] dockStations = new DockStation[5];
        dockStations[0] = new DockStation("A");
        dockStations[1] = new DockStation("B");
        dockStations[2] = new DockStation("C");
        dockStations[3] = new DockStation("D");
        dockStations[4] = new DockStation("E");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu Dump More:");
            System.out.println("1. List Registered Trucks");
            System.out.println("2. Register a Truck");
            System.out.println("3. Exit");

            int selection = scanner.nextInt();

            switch (selection) {
                case 1:
                    TruckRegistration.listRegisteredTrucks(dockStations);
                    break;
                case 2:
                    System.out.println("Select Truck Type:");
                    System.out.println("1. Van");
                    System.out.println("2. SmallTruck");
                    System.out.println("3. HeavyTruck");

                    int truckTypeChoice = scanner.nextInt();

                    System.out.println("Enter the weight:");
                    double weight = scanner.nextDouble();

                    if (TruckRegistration.registerTruck(truckTypeChoice, weight, dockStations)) {
                        System.out.println("Truck registered successfully.");
                    } else {
                        System.out.println("No available dock station for this truck.");
                    }
                    break;
                case 3:
                    System.out.println("Exiting program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
