import Components.*;
import VehicleType.Car;
import VehicleType.ElectricCar;
import VehicleType.HybridCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Car car;
    ElectricCar electricCar;
    HybridCar hybridCar;
    Chassis chassis;
    Doors doors;
    Engine engine;
    Tyres tyres;
    Windows windows;
    Exhaust exhaust;

    @Before
    public void before() {
        chassis = new Chassis();
        doors = new Doors();
        engine = new Engine();
        tyres = new Tyres();
        windows = new Windows();
        car = new Car("Pink", engine, 50.00, chassis, doors, windows, tyres, exhaust);
        electricCar = new ElectricCar("Pink", engine, 50.00, chassis, doors, windows, tyres);
        hybridCar = new HybridCar("Pink", engine, 50.00, chassis, doors, windows, tyres, exhaust);
        customer = new Customer(100);
    }

    @Test
    public void canGetMoney(){
        assertEquals(100, customer.getMoney(), 0.01);
    }

    @Test
    public void canOwnCars(){
        assertEquals(0, customer.getOwnedVehicles());
    }

    @Test
    public void canBuyCars(){
        customer.buyVehicle(car);
        assertEquals(1, customer.getOwnedVehicles());
    }

    @Test
    public void customerCanBuyDifferentCars(){
        customer.buyVehicle(electricCar);
        customer.buyVehicle(hybridCar);
        assertEquals(2, customer.getOwnedVehicles());
    }

    @Test
    public void customerCanOnlyBuyTwoCars(){
        customer.buyVehicle(electricCar);
        customer.buyVehicle(hybridCar);
        customer.buyVehicle(car);
        customer.buyVehicle(electricCar);
        customer.buyVehicle(hybridCar);
        customer.buyVehicle(car);
        customer.buyVehicle(electricCar);
        customer.buyVehicle(hybridCar);
        customer.buyVehicle(car);
        customer.buyVehicle(electricCar);
        customer.buyVehicle(hybridCar);
        customer.buyVehicle(car);
        customer.buyVehicle(electricCar);
        customer.buyVehicle(hybridCar);
        customer.buyVehicle(car);
        customer.buyVehicle(electricCar);
        customer.buyVehicle(hybridCar);
        customer.buyVehicle(car);
        assertEquals(2, customer.getOwnedVehicles());
    }
}
