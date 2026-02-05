class Bike {
    String model = "StormRider 250";
    String engineType = "Single Cylinder";
    int engineCC = 249;
    int mileage = 38;
    int topSpeed = 145;
    String brakeType = "Disc";
    int fuelTank = 14;
    String color = "Matte Grey";
    String transmission = "Manual";
    String manufacture = "Yamaha";

    public static void main(String[] args) {
        Bike b = new Bike();
        System.out.println(b.model);
        System.out.println(b.engineType);
        System.out.println(b.engineCC);
        System.out.println(b.mileage);
        System.out.println(b.topSpeed);
        System.out.println(b.brakeType);
        System.out.println(b.fuelTank);
        System.out.println(b.color);
        System.out.println(b.transmission);
        System.out.println(b.manufacture);
    }
}
