class Television {
    String brand = "SONIQ";
    String screenType = "LED";
    int screenSize = 55;
    String resolution = "4K UHD";
    int refreshRate = 120;
    String smartOS = "Android TV";
    int hdmiPorts = 3;
    int usbPorts = 2;
    String soundSystem = "Dolby Audio";
    String manufacture = "Sony";

    public static void main(String[] args) {
        Television t = new Television();
        System.out.println(t.brand);
        System.out.println(t.screenType);
        System.out.println(t.screenSize);
        System.out.println(t.resolution);
        System.out.println(t.refreshRate);
        System.out.println(t.smartOS);
        System.out.println(t.hdmiPorts);
        System.out.println(t.usbPorts);
        System.out.println(t.soundSystem);
        System.out.println(t.manufacture);
    }
}
