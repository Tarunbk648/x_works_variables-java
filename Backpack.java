class Backpack {
    String brand = "Wildcraft Trailblazer";
    int capacityLiters = 45;
    String material = "Ripstop Polyester";
    boolean waterproof = true;
    int compartments = 5;
    boolean laptopSleeve = true;
    int maxLaptopInch = 15;
    String color = "Olive Green";
    double weight = 900;
    double price = 2899;
    String usage = "Travel";
    String warranty = "2 Years";

    public static void main(String[] args) {
        Backpack b = new Backpack();
        System.out.println(b.brand);
        System.out.println(b.capacityLiters);
        System.out.println(b.material);
        System.out.println(b.waterproof);
        System.out.println(b.compartments);
        System.out.println(b.laptopSleeve);
        System.out.println(b.maxLaptopInch);
        System.out.println(b.color);
        System.out.println(b.weight);
        System.out.println(b.price);
        System.out.println(b.usage);
        System.out.println(b.warranty);
    }
}
