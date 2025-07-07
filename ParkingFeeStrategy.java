public interface ParkingFeeStrategy {
    public double calculateFare(String vehicleType, DurationType durationType, int duration);
}
