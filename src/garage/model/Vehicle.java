package garage.model;

public abstract class Vehicle {
    private String licensePlate;
    private String brand;
    private boolean isParked;

    public Vehicle(String licensePlate, String brand) {
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.isParked = false;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public boolean isParked() {
        return isParked;
    }

    public void park() {
        if (isParked) {
            throw new IllegalStateException("Vehicle is already parked.");
        }
        isParked = true;
    }

    public void leave() {
        if (!isParked) {
            throw new IllegalStateException("Vehicle is not parked.");
        }
        isParked = false;
    }

    public abstract void displayInfo();
}
