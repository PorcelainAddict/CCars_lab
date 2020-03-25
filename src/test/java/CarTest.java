import Components.*;
import VehicleType.Car;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;
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
    }

    @Test
    public void canGetColour(){
        assertEquals("Pink", car.getColour());
    }

    @Test
    public void canGetEngineType(){
        assertEquals(engine, car.getEngineType());
    }

    @Test
    public void canGetPrice(){
        assertEquals(50.00, car.getPrice(), 0.01);
    }

    @Test
    public void canGetChassis(){
        assertEquals(chassis, car.getChassis());
    }

    @Test
    public void canGetDoors(){
        assertEquals(doors, car.getDoors());
    }

    @Test
    public void canGetWindows(){
        assertEquals(windows, car.getWindows());
    }

    @Test
    public void canGetTyres(){
        assertEquals(tyres, car.getTyres());
    }

    @Test
    public void canGetExhaust(){
        assertEquals(exhaust, car.getExhaust());
    }

    @Test
    public void canGetDamaged(){
        car.damage(25);
        assertEquals(25, car.getPrice(),0.01);
    }

    @Test
    public void canGetRepaired(){
        car.damage(25);
        car.repair(25);
        assertEquals(50, car.getPrice(),0.01);
    }
}

