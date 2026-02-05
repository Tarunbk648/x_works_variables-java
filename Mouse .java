class Mouse {
    String model = "Logitech G304";
    String sensorType = "HERO";
    int dpi = 12000;
    boolean wireless = true;
    int batteryMonths = 9;
    String connectivity = "Lightspeed";
    int buttons = 6;
    String color = "White";
    double weight = 99;
    double price = 3295;
    boolean programmable = true;
    String warranty = "2 Years";

    public static void main(String[] args) {
        Mouse m = new Mouse();
        System.out.println(m.model);
        System.out.println(m.sensorType);
        System.out.println(m.dpi);
        System.out.println(m.wireless);
        System.out.println(m.batteryMonths);
        System.out.println(m.connectivity);
        System.out.println(m.buttons);
        System.out.println(m.color);
        System.out.println(m.weight);
        System.out.println(m.price);
        System.out.println(m.programmable);
        System.out.println(m.warranty);
    }
}
