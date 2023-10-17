package seminars.second.hw;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    @Test
    public void testCarIsInstanceOfVehicle() {
        Vehicle car = new Car("Nissan", "GT-R", 2023);
        assertTrue(car instanceof Vehicle);
    }

    @Test
    public void testMotorcycleIsInstanceOfVehicle() {
        Motorcycle motorcycle = new Motorcycle("YAMAHA", "YZ450F", 2023);
        assertTrue(motorcycle instanceof Vehicle);
    }

    @Test
    public void testCarHasFourWheels() {
        Car car = new Car("Nissan", "GT-R", 2023);
        assertEquals(4, car.getNumWheels());
    }

    @Test
    public void testMotorcycleHasTwoWheels() {
        Motorcycle motorcycle = new Motorcycle("YAMAHA", "YZ450F", 2023);
        assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    public void testCarSpeedAfterTestDrive() {
        Car car = new Car("Nissan", "GT-R", 2023);
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    @Test
    public void testMotorcycleSpeedAfterTestDrive() {
        Motorcycle motorcycle = new Motorcycle("YAMAHA", "YZ450F", 2023);
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    @Test
    public void testCarSpeedAfterParking() {
        Car car = new Car("Nissan", "GT-R", 2023);
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    @Test
    public void testMotorcycleSpeedAfterParking() {
        Motorcycle motorcycle = new Motorcycle("YAMAHA", "YZ450F", 2023);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }
}