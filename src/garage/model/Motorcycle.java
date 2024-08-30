package garage.model;

public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String licensePlate, String brand, boolean hasSidecar) {
        super(licensePlate, brand);
        this.hasSidecar = hasSidecar;
    }

    public boolean hasSidecar() {
        return hasSidecar;
    }

    @Override
    public void displayInfo() {
        System.out.println("Motorcycle [License Plate: " + getLicensePlate() + ", Brand: " + getBrand() + ", Sidecar: " + (hasSidecar ? "Yes" : "No") + "]");
    }
}
