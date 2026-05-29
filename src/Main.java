public class Main {

    public static void main(String[] args) {

        SmartHome home = new SmartHome();

        Device d1 = new Light("Living Room Light");
        Device d2 = new Fan("Bedroom Fan");
        Device d3 = new DoorLock("Main Door");
        Device d4 = new TemperatureSensor("Kitchen Sensor");

        home.addDevice(d1);
        home.addDevice(d2);
        home.addDevice(d3);
        home.addDevice(d4);

        System.out.println("=== SMART HOME SYSTEM ===");

        home.showAllDevices();

        System.out.println("\n=== Turning Devices ON ===");

        d1.turnOn();
        d2.turnOn();
        d3.turnOn();
        d4.turnOn();

        System.out.println("\n=== Device Status ===");

        home.showAllDevices();
    }
}
