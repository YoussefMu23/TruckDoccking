public class TruckRegistration {

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

        Truck truck = new Truck(truckType, weight);

        for (DockStation station : dockStations) {
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

    public static void listRegisteredTrucks(DockStation[] dockStations) {
        for (DockStation station : dockStations) {
            if (!station.isAvailable()) {
                Truck truck = station.getParkedTruck();
                System.out.println(station.getStationId() + " - " + truck.getType() + " [" + truck.getWeight() + "kg]");
            }
        }
    }
}
