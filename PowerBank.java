class PowerBank {
    String model = "Mi Power Bank 3i";
    int capacityMAH = 20000;
    boolean fastCharging = true;
    int outputPorts = 2;
    String inputType = "USB-C";
    String material = "Aluminium";
    String color = "Space Grey";
    double weight = 430;
    double price = 1999;
    boolean ledIndicator = true;
    String warranty = "6 Months";
    boolean airlineSafe = true;

    public static void main(String[] args) {
        PowerBank p = new PowerBank();
        System.out.println(p.model);
        System.out.println(p.capacityMAH);
        System.out.println(p.fastCharging);
        System.out.println(p.outputPorts);
        System.out.println(p.inputType);
        System.out.println(p.material);
        System.out.println(p.color);
        System.out.println(p.weight);
        System.out.println(p.price);
        System.out.println(p.ledIndicator);
        System.out.println(p.warranty);
        System.out.println(p.airlineSafe);
    }
}
