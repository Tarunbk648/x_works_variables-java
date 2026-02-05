class OfficeChair {
    String model = "FeatherLite Helix";
    String chairType = "Ergonomic";
    String frameMaterial = "Aluminium";
    boolean lumbarSupport = true;
    boolean headRest = true;
    int maxWeightKG = 136;
    String seatMaterial = "Mesh";
    boolean adjustableHeight = true;
    String color = "Grey";
    double price = 13999;
    String warranty = "5 Years";
    boolean swivel = true;

    public static void main(String[] args) {
        OfficeChair c = new OfficeChair();
        System.out.println(c.model);
        System.out.println(c.chairType);
        System.out.println(c.frameMaterial);
        System.out.println(c.lumbarSupport);
        System.out.println(c.headRest);
        System.out.println(c.maxWeightKG);
        System.out.println(c.seatMaterial);
        System.out.println(c.adjustableHeight);
        System.out.println(c.color);
        System.out.println(c.price);
        System.out.println(c.warranty);
        System.out.println(c.swivel);
    }
}
