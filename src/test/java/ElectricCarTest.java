
import Components.*;
import VehicleType.ElectricCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    ElectricCar electricCar;
    Chassis chassis;
    Doors doors;
    Engine engine;
    Tyres tyres;
    Windows windows;

    @Before
    public void before(){
        chassis = new Chassis();
        doors = new Doors();
        engine = new Engine();
        tyres = new Tyres();
        windows = new Windows();
        electricCar = new ElectricCar("Pink", engine, 50.00, chassis, doors, windows, tyres);
    }

    @Test
    public void canGetColour(){
        assertEquals("Pink", electricCar.getColour());
    }

    @Test
    public void canGetEngineType(){
        assertEquals(engine, electricCar.getEngineType());
    }

    @Test
    public void canGetPrice(){
        assertEquals(50.00, electricCar.getPrice(), 0.01);
    }

    @Test
    public void canGetChassis(){
        assertEquals(chassis, electricCar.getChassis());
    }

    @Test
    public void canGetDoors(){
        assertEquals(doors, electricCar.getDoors());
    }

    @Test
    public void canGetWindows(){
        assertEquals(windows, electricCar.getWindows());
    }

    @Test
    public void canGetTyres(){
        assertEquals(tyres, electricCar.getTyres());
    }
}
