package garage.model;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String licensePlate, String brand, int numberOfDoors) {
        super(licensePlate, brand);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car [License Plate: " + getLicensePlate() + ", Brand: " + getBrand() + ", Doors: " + numberOfDoors + "]");
    }
}
