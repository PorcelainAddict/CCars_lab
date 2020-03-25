package VehicleType;

import Components.*;

public class Car extends Vehicle {

    private Exhaust exhaust;

    public Car(String colour, Engine engineType, double price, Chassis chassis, Doors doors, Windows windows, Tyres tyres, Exhaust exhaust){
        super(colour, engineType, price, chassis, doors, windows, tyres);
        this.exhaust = exhaust;
    }

    public Exhaust getExhaust(){
        return exhaust;
    }



}
