class GamingConsole {
    String model = "PlayStation 5 Slim";
    String processor = "AMD Zen 2";
    int storageGB = 1024;
    String graphics = "RDNA 2";
    boolean rayTracing = true;
    int maxResolution = 8;
    String controllerType = "DualSense";
    boolean onlineSupport = true;
    String color = "White";
    double weightKg = 3.2;
    double price = 54990;
    String warranty = "1 Year";

    public static void main(String[] args) {
        GamingConsole g = new GamingConsole();
        System.out.println(g.model);
        System.out.println(g.processor);
        System.out.println(g.storageGB);
        System.out.println(g.graphics);
        System.out.println(g.rayTracing);
        System.out.println(g.maxResolution);
        System.out.println(g.controllerType);
        System.out.println(g.onlineSupport);
        System.out.println(g.color);
        System.out.println(g.weightKg);
        System.out.println(g.price);
        System.out.println(g.warranty);
    }
}
