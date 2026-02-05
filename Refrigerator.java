class Refrigerator {
    String model = "FROST FREE X200";
    String doorType = "Double Door";
    int capacity = 340;
    int powerUsage = 180;
    String coolingType = "Multi Air Flow";
    String color = "Silver";
    int shelves = 4;
    String compressor = "Inverter";
    String manufacture = "Samsung";
    String defrostType = "Automatic";

    public static void main(String[] args) {
        Refrigerator r = new Refrigerator();
        System.out.println(r.model);
        System.out.println(r.doorType);
        System.out.println(r.capacity);
        System.out.println(r.powerUsage);
        System.out.println(r.coolingType);
        System.out.println(r.color);
        System.out.println(r.shelves);
        System.out.println(r.compressor);
        System.out.println(r.manufacture);
        System.out.println(r.defrostType);
    }
}
