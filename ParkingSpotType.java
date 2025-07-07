public enum ParkingSpotType {
    BIKE("BIKE"),
    CAR("CAR"),
    TRUCK("TRUCK");

    private final String value;

    ParkingSpotType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
    
}
