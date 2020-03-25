package VehicleType;

import Components.*;


public abstract class Vehicle implements IDamage{

    private String colour;
    private Engine engineType;
    private double price;
    private Chassis chassis;
    private Doors doors;
    private Windows windows;
    private Tyres tyres;
    private double damage;


    public Vehicle(String colour, Engine engineType, double price, Chassis chassis, Doors doors, Windows windows, Tyres tyres){
        this.colour = colour;
        this.engineType = engineType;
        this.price = price;
        this.chassis = chassis;
        this.doors = doors;
        this.windows = windows;
        this.tyres = tyres;
        this.damage = 0;
    }

    public String getColour() {
        return colour;
    }

    public Engine getEngineType() {
        return engineType;
    }

    public double getPrice() {
        return price;
    }

    public Chassis getChassis() {
        return chassis;
    }

    public Doors getDoors() {
        return doors;
    }

    public Windows getWindows() {
        return windows;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public void damage(double damage){
        this.price -= damage;
        this.damage = damage;
    }

    public double getDamage(){
        return damage;
    }

    public void repair(double repair){
        this.price += repair;
        this.damage -= repair;
    }
}
