import Components.*;
import VehicleType.Car;
import VehicleType.ElectricCar;
import VehicleType.HybridCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
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
    public void before(){
        chassis = new Chassis();
        doors = new Doors();
        engine = new Engine();
        tyres = new Tyres();
        windows = new Windows();
        car = new Car("Pink", engine, 50.00, chassis, doors, windows, tyres, exhaust);
        electricCar = new ElectricCar("Pink", engine, 50.00, chassis, doors, windows, tyres);
        hybridCar = new HybridCar("Pink", engine, 50.00, chassis, doors, windows, tyres, exhaust);
        customer = new Customer(100);
        dealership = new Dealership(40000);
    }

    @Test
    public void canGetTill(){
        assertEquals(40000, dealership.getTill(), 0.01);
    }

    @Test
    public void canGetStock(){
        assertEquals(0, dealership.getStock());
    }

    @Test
    public void canBuyVehicle(){
        dealership.buyVehicle(car);
        assertEquals(1, dealership.getStock());
    }

    @Test
    public void canBuyDifferentTypesOfVehicles(){
        dealership.buyVehicle(electricCar);
        dealership.buyVehicle(car);
        dealership.buyVehicle(hybridCar);
        assertEquals(3, dealership.getStock());
    }

    @Test
    public void canSellVehicleToCustomer(){
        dealership.buyVehicle(electricCar);
        dealership.buyVehicle(car);
        dealership.buyVehicle(hybridCar);
        dealership.sellVehicle(customer, hybridCar);
        assertEquals(2, dealership.getStock());
        assertEquals(39900, dealership.getTill(), 0.01);
        assertEquals(50, customer.getMoney(), 0.01);
        assertEquals(1, customer.getOwnedVehicles());
    }

    @Test
    public void canRepairCar(){
        electricCar.damage(50);
        dealership.vehicleRepairDamage(electricCar);
        assertEquals(50, electricCar.getPrice(),0.01);
        assertEquals(0, electricCar.getDamage(),0.01);
        assertEquals(39950, dealership.getTill(),0.01);
    }

}
