class MixerGrinder {
    String model = "Butterfly Rapid Plus";
    int wattage = 750;
    int jarCount = 4;
    String bladeMaterial = "Stainless Steel";
    boolean overloadProtection = true;
    String bodyMaterial = "ABS Plastic";
    String speedControl = "3 Speed";
    String color = "Red";
    int warrantyYears = 2;
    double price = 4199;
    String usage = "Kitchen";
    boolean shockProof = true;

    public static void main(String[] args) {
        MixerGrinder m = new MixerGrinder();
        System.out.println(m.model);
        System.out.println(m.wattage);
        System.out.println(m.jarCount);
        System.out.println(m.bladeMaterial);
        System.out.println(m.overloadProtection);
        System.out.println(m.bodyMaterial);
        System.out.println(m.speedControl);
        System.out.println(m.color);
        System.out.println(m.warrantyYears);
        System.out.println(m.price);
        System.out.println(m.usage);
        System.out.println(m.shockProof);
    }
}
