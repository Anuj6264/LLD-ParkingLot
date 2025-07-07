import java.util.List;

public class ParkingLot {
    private final List<Floor> parkingFloors;
    
    public ParkingLot(List<Floor> parkingfloors) {
        this.parkingFloors = parkingfloors;
    }

    public ParkingSpot findParkingSpot(Vehicle vehicle) {
        for(Floor floor: parkingFloors) {
            for(ParkingSpot parkingSpot: floor.getParkingSpots()) {
                if(!parkingSpot.isOccupied() && 
                   parkingSpot.getParkingSpotType().getValue().equalsIgnoreCase(vehicle.getVehicleType())) {
                    return parkingSpot;
                }
            }
        }
        return null;
    }

    public void parkVehicle(Vehicle vehicle) {
        ParkingSpot parkingSpot = findParkingSpot(vehicle);
        if(parkingSpot == null)
            System.out.println("No available spots to park");
        else {
            parkingSpot.parkVehicle(vehicle);
        }
    }

    public void vacate(ParkingSpot parkingSpot) {
        parkingSpot.vacate();
    }

    public void displayParkingLot() {
        for(Floor floor: parkingFloors) {
            for(ParkingSpot parkingSpot: floor.getParkingSpots()) {
                if(parkingSpot.isOccupied()) {
                    System.out.print(parkingSpot.getVehicle().getVehicleId() + " ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("-------------------------------------------------");
    }
}