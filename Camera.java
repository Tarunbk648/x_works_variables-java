class Camera {
    String brand = "Photonix";
    int megapixels = 64;
    String sensorType = "CMOS";
    int opticalZoom = 10;
    String videoResolution = "8K";
    int batteryShots = 1200;
    String storageType = "SDXC";
    String color = "Black";
    double weight = 0.85;
    String manufacture = "Canon";

    public static void main(String[] args) {
        Camera c = new Camera();
        System.out.println(c.brand);
        System.out.println(c.megapixels);
        System.out.println(c.sensorType);
        System.out.println(c.opticalZoom);
        System.out.println(c.videoResolution);
        System.out.println(c.batteryShots);
        System.out.println(c.storageType);
        System.out.println(c.color);
        System.out.println(c.weight);
        System.out.println(c.manufacture);
    }
}
