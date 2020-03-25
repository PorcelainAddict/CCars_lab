import VehicleType.Vehicle;

import java.util.ArrayList;

public class Customer implements IBuy{

    private double money;
    private ArrayList<Vehicle> ownedVehicles;

    public Customer(double money){
        this.money = money;
        this.ownedVehicles = new ArrayList<Vehicle>();
    }

    public double getMoney() {
        return money;
    }

    public int getOwnedVehicles() {
        return ownedVehicles.size();
    }

    public void buyVehicle(Vehicle vehicle){
        if(this.money >= vehicle.getPrice()) {
            this.ownedVehicles.add(vehicle);
            this.money -= vehicle.getPrice();
        }
    }


}
