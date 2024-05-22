
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Ford", "Fiesta",2012,4000,83);
        Truck truck1 = new Truck("Volvo", "Volvo FH",2022, 12000, 180,4);
        double fuelEfficiency= car1.calculateFuelEfficiency();
        double fuelEfficiency2=truck1.calculateFuelEfficiency();
        System.out.println("Car's fuel efficiency is: "+ fuelEfficiency);
        System.out.println("Truck's fuel efficiency is: "+ fuelEfficiency2);
        }
    }
