import java.util.List;

public class Floor {
    private int floorId;
    private List<ParkingSpot> parkingSpots;
    
    public Floor(int floorId, List<ParkingSpot> parkingSpots) {
        this.floorId = floorId;
        this.parkingSpots = parkingSpots;
    }
    
    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }
}
