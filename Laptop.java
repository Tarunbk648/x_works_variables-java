class Laptop {
    String brand = "ThinkPro";
    String processor = "Intel i7";
    int ram = 16;
    int storage = 1024;
    String storageType = "SSD";
    String os = "Windows 11";
    int batteryLife = 12;
    double weight = 1.8;
    String color = "Graphite";
    String manufacture = "Lenovo";

    public static void main(String[] args) {
        Laptop l = new Laptop();
        System.out.println(l.brand);
        System.out.println(l.processor);
        System.out.println(l.ram);
        System.out.println(l.storage);
        System.out.println(l.storageType);
        System.out.println(l.os);
        System.out.println(l.batteryLife);
        System.out.println(l.weight);
        System.out.println(l.color);
        System.out.println(l.manufacture);
    }
}
