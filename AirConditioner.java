class AirConditioner {
    String brand = "CoolBreeze";
    int ton = 2;
    int powerConsumption = 1500;
    String compressor = "Dual Inverter";
    String refrigerant = "R32";
    String starRating = "5 Star";
    String filterType = "Anti-Bacterial";
    int noiseLevel = 38;
    String color = "White";
    String manufacture = "Daikin";

    public static void main(String[] args) {
        AirConditioner a = new AirConditioner();
        System.out.println(a.brand);
        System.out.println(a.ton);
        System.out.println(a.powerConsumption);
        System.out.println(a.compressor);
        System.out.println(a.refrigerant);
        System.out.println(a.starRating);
        System.out.println(a.filterType);
        System.out.println(a.noiseLevel);
        System.out.println(a.color);
        System.out.println(a.manufacture);
    }
}
