class SmartWatch {
    String brand = "PulseFit";
    String displayType = "OLED";
    int batteryLife = 14;
    String strapMaterial = "Silicone";
    boolean heartRateSensor = true;
    boolean gps = true;
    String waterResistance = "5ATM";
    String os = "WearOS";
    String color = "Midnight Blue";
    String manufacture = "Garmin";

    public static void main(String[] args) {
        SmartWatch s = new SmartWatch();
        System.out.println(s.brand);
        System.out.println(s.displayType);
        System.out.println(s.batteryLife);
        System.out.println(s.strapMaterial);
        System.out.println(s.heartRateSensor);
        System.out.println(s.gps);
        System.out.println(s.waterResistance);
        System.out.println(s.os);
        System.out.println(s.color);
        System.out.println(s.manufacture);
    }
}
