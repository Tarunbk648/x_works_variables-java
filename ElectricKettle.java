class ElectricKettle {
    String model = "Prestige PKOSS";
    int capacityML = 1500;
    int powerWatts = 1500;
    String bodyMaterial = "Stainless Steel";
    boolean autoCutOff = true;
    boolean boilDryProtection = true;
    String lidType = "Flip Lid";
    boolean cordless = true;
    String color = "Silver";
    double weightKg = 1.2;
    double price = 1499;
    String warranty = "1 Year";

    public static void main(String[] args) {
        ElectricKettle k = new ElectricKettle();
        System.out.println(k.model);
        System.out.println(k.capacityML);
        System.out.println(k.powerWatts);
        System.out.println(k.bodyMaterial);
        System.out.println(k.autoCutOff);
        System.out.println(k.boilDryProtection);
        System.out.println(k.lidType);
        System.out.println(k.cordless);
        System.out.println(k.color);
        System.out.println(k.weightKg);
        System.out.println(k.price);
        System.out.println(k.warranty);
    }
}
