class MicrowaveOven {
    String model = "HeatWave Pro";
    int capacity = 32;
    int power = 900;
    String controlType = "Touch Panel";
    String cookingMode = "Convection";
    String color = "Black";
    int autoMenus = 251;
    String doorType = "Side Open";
    String cavityMaterial = "Ceramic";
    String manufacture = "IFB";

    public static void main(String[] args) {
        MicrowaveOven m = new MicrowaveOven();
        System.out.println(m.model);
        System.out.println(m.capacity);
        System.out.println(m.power);
        System.out.println(m.controlType);
        System.out.println(m.cookingMode);
        System.out.println(m.color);
        System.out.println(m.autoMenus);
        System.out.println(m.doorType);
        System.out.println(m.cavityMaterial);
        System.out.println(m.manufacture);
    }
}
