import Components.*;
import VehicleType.Car;
import VehicleType.HybridCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HybridCarTest {

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
        hybridCar = new HybridCar("Pink", engine, 50.00, chassis, doors, windows, tyres, exhaust);
    }

    @Test
    public void canGetColour(){
        assertEquals("Pink", hybridCar.getColour());
    }

    @Test
    public void canGetEngineType(){
        assertEquals(engine, hybridCar.getEngineType());
    }

    @Test
    public void canGetPrice(){
        assertEquals(50.00, hybridCar.getPrice(), 0.01);
    }

    @Test
    public void canGetChassis(){
        assertEquals(chassis, hybridCar.getChassis());
    }

    @Test
    public void canGetDoors(){
        assertEquals(doors, hybridCar.getDoors());
    }

    @Test
    public void canGetWindows(){
        assertEquals(windows, hybridCar.getWindows());
    }

    @Test
    public void canGetTyres(){
        assertEquals(tyres, hybridCar.getTyres());
    }

    @Test
    public void canGetExhaust(){
        assertEquals(exhaust, hybridCar.getExhaust());
    }
}
