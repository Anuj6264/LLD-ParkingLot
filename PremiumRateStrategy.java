public class PremiumRateStrategy implements ParkingFeeStrategy {
    @Override
    public double calculateFare(String vehicleType, DurationType durationType, int duration) {
       return 0.0;
    }
}
