class AirFryer {
    String model = "Philips Rapid Fry";
    int capacityLiters = 6;
    int powerWatts = 1700;
    String cookingTechnology = "Rapid Air";
    boolean digitalDisplay = true;
    int presetMenus = 7;
    String basketMaterial = "Non-Stick";
    boolean autoShutOff = true;
    String color = "Black";
    double weightKg = 5.6;
    double price = 10999;
    String warranty = "2 Years";

    public static void main(String[] args) {
        AirFryer a = new AirFryer();
        System.out.println(a.model);
        System.out.println(a.capacityLiters);
        System.out.println(a.powerWatts);
        System.out.println(a.cookingTechnology);
        System.out.println(a.digitalDisplay);
        System.out.println(a.presetMenus);
        System.out.println(a.basketMaterial);
        System.out.println(a.autoShutOff);
        System.out.println(a.color);
        System.out.println(a.weightKg);
        System.out.println(a.price);
        System.out.println(a.warranty);
    }
}
