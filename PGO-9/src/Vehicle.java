abstract public class Vehicle {
    private String brand;
    private String model;
    private int yearOfProduction;
    public Vehicle(String brand, String model, int yearOfProduction) {
        this.brand = brand;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }
    abstract double calculateFuelEfficiency();
}
