class WaterBottle {
    String brand = "Cello Puro";
    int capacityML = 750;
    String material = "BPA Free Plastic";
    boolean leakProof = true;
    boolean freezerSafe = true;
    String lidType = "Flip Cap";
    double weight = 180;
    String color = "Aqua Blue";
    double price = 299;
    String usage = "Daily";
    boolean dishwasherSafe = true;
    String warranty = "6 Months";

    public static void main(String[] args) {
        WaterBottle w = new WaterBottle();
        System.out.println(w.brand);
        System.out.println(w.capacityML);
        System.out.println(w.material);
        System.out.println(w.leakProof);
        System.out.println(w.freezerSafe);
        System.out.println(w.lidType);
        System.out.println(w.weight);
        System.out.println(w.color);
        System.out.println(w.price);
        System.out.println(w.usage);
        System.out.println(w.dishwasherSafe);
        System.out.println(w.warranty);
    }
}
