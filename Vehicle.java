public abstract class Vehicle {
    private String vehicleId;
    private ParkingFeeStrategy parkingFeeStrategy;
    private String vehicleType;

    public Vehicle(String vehicleId, ParkingFeeStrategy parkingFeeStrategy, String vehicleType) {
        this.vehicleId = vehicleId;
        this.parkingFeeStrategy = parkingFeeStrategy;
        this.vehicleType = vehicleType;
    }

    public String getVehicleType() {
        return this.vehicleType;
    }

    public String getVehicleId() {
        return this.vehicleId;
    }

    public double calculateFare(DurationType durationType, int duration) {
        return parkingFeeStrategy.calculateFare(vehicleType, durationType, duration);
    }

}
