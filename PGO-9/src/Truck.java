public class Truck extends Vehicle {
    protected int milesDriven;
    protected int fuelConsumed;
    protected int cargoWeight;
    public Truck(String brand, String model, int yearOfProduction, int milesDriven, int fuelConsumed, int cargoWeightWeight) {
        super(brand, model, yearOfProduction);
        this.milesDriven = milesDriven;
        this.fuelConsumed = fuelConsumed;
        this.cargoWeight = cargoWeight;
    }
    @Override
    double calculateFuelEfficiency() {
        double additionalFuelConsumpiton= cargoWeight*0.5;
        double fuelEfficiency = milesDriven/(fuelConsumed+additionalFuelConsumpiton);
        return fuelEfficiency;
    }
}
