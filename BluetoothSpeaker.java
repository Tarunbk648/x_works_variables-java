class BluetoothSpeaker {
    String model = "Boat Stone 180";
    int outputWatts = 5;
    String connectivity = "Bluetooth 5.0";
    boolean waterproof = true;
    int batteryHours = 10;
    String chargingType = "Micro USB";
    boolean micSupport = true;
    String soundMode = "Bass Boost";
    String color = "Blue";
    double weightGrams = 230;
    double price = 999;
    String warranty = "1 Year";

    public static void main(String[] args) {
        BluetoothSpeaker b = new BluetoothSpeaker();
        System.out.println(b.model);
        System.out.println(b.outputWatts);
        System.out.println(b.connectivity);
        System.out.println(b.waterproof);
        System.out.println(b.batteryHours);
        System.out.println(b.chargingType);
        System.out.println(b.micSupport);
        System.out.println(b.soundMode);
        System.out.println(b.color);
        System.out.println(b.weightGrams);
        System.out.println(b.price);
        System.out.println(b.warranty);
    }
}
