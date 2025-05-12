public class Car {
    public static void main(String[] args) {
        CarDetails obj = new CarDetails();
        obj.Name = "BMW";
        obj.Size = 5;
        obj.Color = "Black";
        obj.fuelCapacity = 50;
        obj.FuelType = "Petrol";
        obj.CarType = "Luxury";
        obj.displayDetails();
        System.out.println("====================================");

        CarDetails obj1 = new CarDetails();
        obj1.Name = "Audi";
        obj1.Size = 4; 
        obj1.Color = "White";
        obj1.fuelCapacity = 60;
        obj1.FuelType = "Diesel";
        obj1.CarType = "Luxury";
        obj1.displayDetails();
    }
    
}
class CarDetails {
    String Name;
    int Size;
    String Color;
    int fuelCapacity;
    String FuelType;
    String CarType;

    Public void displayDetails(){
        System.out.println("Your Car Details are:");
        System.out.println("Name: " + Name + "CarSize: " + Size + "CarColor: " + Color + "Fuel Capacity: " + fuelCapacity + "Fuel Type: " + FuelType + "Car Type: " + CarType); 
    }

    
}
