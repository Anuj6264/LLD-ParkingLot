public class VehicleFactory {
    public Vehicle createVehicle(String vechicleId, String vehicleType, ParkingFeeStrategy parkingFeeStrategy) {
        if(vehicleType.equalsIgnoreCase("BIKE"))
            return new Bike(vechicleId, parkingFeeStrategy);
        else if(vehicleType.equalsIgnoreCase("CAR"))
            return new Car(vechicleId, parkingFeeStrategy);
        else
            return new Truck(vechicleId, parkingFeeStrategy);
    }
}
