class MobilePhone {
    String model = "Nova Z9";
    String processor = "Snapdragon 8 Gen 2";
    int ram = 12;
    int storage = 256;
    int battery = 5000;
    String camera = "108MP";
    String display = "AMOLED";
    int refreshRate = 144;
    String os = "Android 14";
    String manufacture = "OnePlus";

    public static void main(String[] args) {
        MobilePhone m = new MobilePhone();
        System.out.println(m.model);
        System.out.println(m.processor);
        System.out.println(m.ram);
        System.out.println(m.storage);
        System.out.println(m.battery);
        System.out.println(m.camera);
        System.out.println(m.display);
        System.out.println(m.refreshRate);
        System.out.println(m.os);
        System.out.println(m.manufacture);
    }
}
