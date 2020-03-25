import VehicleType.Vehicle;

import java.util.ArrayList;

public class Dealership implements IBuy {

    private double till;
    private ArrayList<Vehicle> stock;

    public Dealership(double till){
        this.till = till;
        this.stock = new ArrayList<Vehicle>();
    }

    public double getTill() {
        return till;
    }

    public int getStock() {
        return stock.size();
    }

    public void buyVehicle(Vehicle vehicle){
        if(this.till >= vehicle.getPrice()) {
            this.stock.add(vehicle);
            this.till -= vehicle.getPrice();
        }
    }

    public void sellVehicle(Customer customer, Vehicle vehicle){
        if(customer.getMoney() >= vehicle.getPrice() && this.stock.contains(vehicle)) {
            customer.buyVehicle(vehicle);
            this.stock.remove(vehicle);
            this.till += vehicle.getPrice();
        }
    }

    public void vehicleRepairDamage(Vehicle vehicle){
        if(this.till >= vehicle.getDamage()){
            this.till -= vehicle.getDamage();
            vehicle.repair(vehicle.getDamage());

        };

    }
}
