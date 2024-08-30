package garage.management;

import garage.model.Vehicle;
import garage.model.Car;
import garage.model.Motorcycle;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    private List<Vehicle> vehicles;

    public Garage() {
        vehicles = new ArrayList<>();
    }

    public void parkVehicle(Vehicle vehicle) throws GarageException {
        if (vehicle.isParked()) {
            throw new GarageException("Vehicle is already parked.");
        }
        vehicle.park();
        vehicles.add(vehicle);
        System.out.println("Vehicle parked: " + vehicle.getLicensePlate());
    }

    public void removeVehicle(String licensePlate) throws GarageException {
        Vehicle vehicle = findVehicleByLicensePlate(licensePlate);
        if (vehicle == null) {
            throw new GarageException("Vehicle not found.");
        }
        if (!vehicle.isParked()) {
            throw new GarageException("Vehicle is not parked.");
        }
        vehicle.leave();
        vehicles.remove(vehicle);
        System.out.println("Vehicle removed: " + licensePlate);
    }

    public void displayAllVehicles() {
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
        }
    }

    private Vehicle findVehicleByLicensePlate(String licensePlate) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getLicensePlate().equalsIgnoreCase(licensePlate)) {
                return vehicle;
            }
        }
        return null;
    }
}
