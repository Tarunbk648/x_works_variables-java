class DeskLamp {
    String model = "Wipro Garnet";
    String lightType = "LED";
    int wattage = 6;
    int brightnessLevels = 3;
    boolean touchControl = true;
    boolean eyeCare = true;
    String powerSource = "USB";
    String color = "White";
    double heightCM = 38;
    double price = 1299;
    String usage = "Study";
    String warranty = "1 Year";

    public static void main(String[] args) {
        DeskLamp d = new DeskLamp();
        System.out.println(d.model);
        System.out.println(d.lightType);
        System.out.println(d.wattage);
        System.out.println(d.brightnessLevels);
        System.out.println(d.touchControl);
        System.out.println(d.eyeCare);
        System.out.println(d.powerSource);
        System.out.println(d.color);
        System.out.println(d.heightCM);
        System.out.println(d.price);
        System.out.println(d.usage);
        System.out.println(d.warranty);
    }
}
