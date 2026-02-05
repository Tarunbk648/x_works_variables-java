class Speaker {
    String brand = "BoomSound";
    int outputPower = 60;
    boolean bluetooth = true;
    String frequencyRange = "20Hz-20kHz";
    int batteryLife = 18;
    String waterproof = "IPX7";
    String connectivity = "Bluetooth 5.3";
    String color = "Red";
    String usage = "Outdoor";
    String manufacture = "JBL";

    public static void main(String[] args) {
        Speaker s = new Speaker();
        System.out.println(s.brand);
        System.out.println(s.outputPower);
        System.out.println(s.bluetooth);
        System.out.println(s.frequencyRange);
        System.out.println(s.batteryLife);
        System.out.println(s.waterproof);
        System.out.println(s.connectivity);
        System.out.println(s.color);
        System.out.println(s.usage);
        System.out.println(s.manufacture);
    }
}
