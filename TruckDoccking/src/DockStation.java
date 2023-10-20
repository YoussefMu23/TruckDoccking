public class DockStation {
    private String stationId;
    private boolean isOccupied;
    private Truck parkedTruck;

    public DockStation(String id) {
        this.stationId = id;
        this.isOccupied = false;
    }
    public String getStationId() {
        return stationId;
    }

    public boolean isAvailable() {
        return !isOccupied;
    }

    public void park(Truck truck) {
        isOccupied = true;
        parkedTruck = truck;
    }

    public Truck getParkedTruck() {
        return parkedTruck;
    }
}

