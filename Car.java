class Car {
    String model = "Astra ZX";
    String fuelType = "Petrol";
    int engineCC = 1498;
    int mileage = 21;
    int airbags = 6;
    String transmission = "Automatic";
    String driveType = "FWD";
    int seatingCapacity = 5;
    String color = "Pearl White";
    String manufacture = "Hyundai";

    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.model);
        System.out.println(c.fuelType);
        System.out.println(c.engineCC);
        System.out.println(c.mileage);
        System.out.println(c.airbags);
        System.out.println(c.transmission);
        System.out.println(c.driveType);
        System.out.println(c.seatingCapacity);
        System.out.println(c.color);
        System.out.println(c.manufacture);
    }
}
