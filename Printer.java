class Printer {
    String brand = "PrintMaster";
    String type = "Laser";
    boolean colorPrint = true;
    int printSpeed = 30;
    String connectivity = "WiFi";
    int trayCapacity = 250;
    String duplex = "Automatic";
    int resolution = 1200;
    String usage = "Office";
    String manufacture = "HP";

    public static void main(String[] args) {
        Printer p = new Printer();
        System.out.println(p.brand);
        System.out.println(p.type);
        System.out.println(p.colorPrint);
        System.out.println(p.printSpeed);
        System.out.println(p.connectivity);
        System.out.println(p.trayCapacity);
        System.out.println(p.duplex);
        System.out.println(p.resolution);
        System.out.println(p.usage);
        System.out.println(p.manufacture);
    }
}
