package VehicleType;

import Components.*;

public class ElectricCar extends Vehicle {

  public ElectricCar (String colour, Engine engineType, double price, Chassis chassis, Doors doors, Windows windows, Tyres tyres){
        super(colour, engineType, price, chassis, doors, windows, tyres);
    }
}
