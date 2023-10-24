public class DockStation {

    // Dockstaion represents station for parking trucks.
    private String stationId;
    private boolean isOccupied;
    private Truck parkedTruck;

    // Constructor
    public DockStation(String id) {
        this.stationId = id;
        this.isOccupied = false;
    }
    public String getStationId() {
        return stationId;            // Get station ID.
    }

    public boolean isAvailable() {
        return !isOccupied;          // Check if the station is available and not occupied.
    }

    public void park(Truck truck) {
        isOccupied = true;
        parkedTruck = truck;          // Parks truck at station and mark it as occupied. 
    }

    public Truck getParkedTruck() {
        return parkedTruck;            // Get the truck parked at the station.
    }
}

