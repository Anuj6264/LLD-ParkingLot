public class BasicHourlyRateStrategy implements ParkingFeeStrategy {
    @Override
     public double calculateFare(String vehicleType, DurationType durationType, int duration) {
        switch (vehicleType.toUpperCase()) {
            case "CAR":
                return durationType == DurationType.HOURLY
                        ? duration * 10.0   // $10 per hour for cars
                        : duration * 10.0 * 24;  // Daily rate

            case "BIKE":
                return durationType == DurationType.HOURLY
                        ? duration * 5.0    // $5 per hour for bikes
                        : duration * 5.0 * 24;  // Daily rate
            default:
                return durationType == DurationType.HOURLY
                        ? duration * 15.0   // $15 per hour for other vehicles
                        : duration * 15.0 * 24;  // Daily rate
        }
    }
}
