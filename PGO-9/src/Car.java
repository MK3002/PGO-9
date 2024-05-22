public class Car extends Vehicle   {
    protected int milesDriven;
    protected int fuelConsumed;
    public Car(String brand, String model, int yearOfProduction, int milesDriven, int fuelConsumed) {
        super(brand, model, yearOfProduction);
        this.milesDriven = milesDriven;
        this.fuelConsumed = fuelConsumed;
    }
    @Override
    double calculateFuelEfficiency() {
        double fuelEfficiency =  milesDriven/fuelConsumed;
        return fuelEfficiency;
    }
}

