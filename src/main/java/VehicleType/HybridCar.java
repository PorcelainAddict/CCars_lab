package VehicleType;

import Components.*;


public class HybridCar extends Vehicle {

    private Exhaust exhaust;

    public HybridCar (String colour, Engine engineType, double price, Chassis chassis, Doors doors, Windows windows, Tyres tyres, Exhaust exhaust){
        super(colour, engineType, price, chassis, doors, windows, tyres);
        this.exhaust = exhaust;
    }

    public Exhaust getExhaust(){
        return exhaust;
    }

}
