public class TruckRegistration {
    // TruckRegistration class handels metods for register Truck and listing truck in dockstaion
    public static boolean registerTruck(int truckTypeChoice, double weight, DockStation[] dockStations) {

        String truckType;

        if (truckTypeChoice == 1) {
            truckType = "Van";
        } else if (truckTypeChoice == 2) {
            truckType = "SmallTruck";
        } else if (truckTypeChoice == 3) {
            truckType = "HeavyTruck";
        } else {
            return false;
        }

        Truck truck = new Truck(truckType, weight);  // creating new truck with type and weight.

        // Iterate through dockstaion to find acailable statoin for truck.
        for (DockStation station : dockStations) {
            // Checking if the type and weight are correct with right station.
            if (station.isAvailable()) {
                if ((truckType.equals("Van") && (station.getStationId().equals("A") || station.getStationId().equals("B"))) ||
                        (truckType.equals("SmallTruck") && (station.getStationId().equals("C") || station.getStationId().equals("D") || (station.getStationId().equals("A") && truck.getWeight() < 5000))) ||
                        (truckType.equals("HeavyTruck") && (station.getStationId().equals("E") || (station.getStationId().equals("D") && truck.getWeight() < 9000)))) {
                    station.park(truck);
                    return true;
                }
            }
        }

        return false;
    }

    // List the register truck at each dockstation
    public static void listRegisteredTrucks(DockStation[] dockStations) {
        for (DockStation station : dockStations) {
            if (!station.isAvailable()) {
                Truck truck = station.getParkedTruck();
                System.out.println(station.getStationId() + " - " + truck.getType() + " [" + truck.getWeight() + "kg]");
            }
        }
    }
}
