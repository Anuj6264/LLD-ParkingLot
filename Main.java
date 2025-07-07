import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ParkingSpot> parkingSpots1 = new ArrayList<>();
        List<ParkingSpot> parkingSpots2 = new ArrayList<>();
        List<ParkingSpot> parkingSpots3 = new ArrayList<>();
        ParkingSpot parkingSpot1 = new ParkingSpot(ParkingSpotType.BIKE, null, 1, false);
        ParkingSpot parkingSpot2 = new ParkingSpot(ParkingSpotType.BIKE, null, 2, false);
        parkingSpots1.add(parkingSpot1);
        parkingSpots1.add(parkingSpot2);
        parkingSpots1.add(new ParkingSpot(ParkingSpotType.BIKE, null, 3, false));
        parkingSpots2.add(new ParkingSpot(ParkingSpotType.BIKE, null, 4, false));
        parkingSpots2.add(new ParkingSpot(ParkingSpotType.CAR, null, 5, false));
        parkingSpots2.add(new ParkingSpot(ParkingSpotType.BIKE, null, 6, false));
        parkingSpots2.add(new ParkingSpot(ParkingSpotType.TRUCK, null, 7, false));
        parkingSpots2.add(new ParkingSpot(ParkingSpotType.CAR, null, 8, false));
        parkingSpots3.add(new ParkingSpot(ParkingSpotType.BIKE, null, 9, false));
        parkingSpots3.add(new ParkingSpot(ParkingSpotType.TRUCK, null, 10, false));

        Floor parkingFloor1 = new Floor(1, parkingSpots1);
        Floor parkingFloor2 = new Floor(2, parkingSpots2);
        Floor parkingFloor3 = new Floor(3, parkingSpots3);

        List<Floor> parkingFloors = new ArrayList<>();
        parkingFloors.add(parkingFloor1);
        parkingFloors.add(parkingFloor2);
        parkingFloors.add(parkingFloor3);

        ParkingLot parkingLot = new ParkingLot(parkingFloors);
        parkingLot.displayParkingLot();

        Vehicle vehicle1 = new Bike("MP07", new BasicHourlyRateStrategy());
        Vehicle vehicle2 = new Bike("MP08", new BasicHourlyRateStrategy());
        Vehicle vehicle3 = new Car("RJ17", new PremiumRateStrategy());
        Vehicle vehicle4 = new Truck("RJ19", new BasicHourlyRateStrategy());

        parkingLot.parkVehicle(vehicle1);
        parkingLot.displayParkingLot();
        parkingLot.parkVehicle(vehicle3);
        parkingLot.displayParkingLot();
        parkingLot.parkVehicle(vehicle4);
        parkingLot.displayParkingLot();
        parkingLot.vacate(parkingSpot1);
        parkingLot.displayParkingLot();
        parkingLot.parkVehicle(vehicle1);
        parkingLot.displayParkingLot();
        parkingLot.parkVehicle(vehicle2);
        parkingLot.displayParkingLot();
        parkingLot.vacate(parkingSpot2);
        parkingLot.displayParkingLot();
        parkingLot.parkVehicle(vehicle2);
        parkingLot.displayParkingLot();
    }
}
