public class ParkingSpot {
    private ParkingSpotType parkingSpotType;
    private Vehicle vehicle;
    private int parkingSpotId;
    private boolean isOccupied;

    public ParkingSpot(ParkingSpotType parkingSpotType, Vehicle vehicle, int parkingSpotId, boolean isOccupied) {
        this.parkingSpotType = parkingSpotType;
        this.vehicle = vehicle;
        this.parkingSpotId = parkingSpotId;
        this.isOccupied = isOccupied;
    }

    public int getParkingSpotId() {
        return parkingSpotId;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public ParkingSpotType getParkingSpotType() {
        return parkingSpotType;
    }
    public boolean isOccupied() {
        return isOccupied;
    }

    public void parkVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.isOccupied = true;
    }

    public void vacate() {
        this.vehicle = null;
        this.isOccupied = false;
    }
}
