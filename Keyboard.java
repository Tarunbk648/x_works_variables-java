class Keyboard {
    String model = "Redragon K552";
    String keyboardType = "Mechanical";
    String switchType = "Outemu Blue";
    boolean backlight = true;
    String connectivity = "Wired USB";
    String layout = "Tenkeyless";
    String keyMaterial = "ABS";
    String color = "Black";
    double weight = 870;
    double price = 3999;
    boolean antiGhosting = true;
    String warranty = "1 Year";

    public static void main(String[] args) {
        Keyboard k = new Keyboard();
        System.out.println(k.model);
        System.out.println(k.keyboardType);
        System.out.println(k.switchType);
        System.out.println(k.backlight);
        System.out.println(k.connectivity);
        System.out.println(k.layout);
        System.out.println(k.keyMaterial);
        System.out.println(k.color);
        System.out.println(k.weight);
        System.out.println(k.price);
        System.out.println(k.antiGhosting);
        System.out.println(k.warranty);
    }
}
