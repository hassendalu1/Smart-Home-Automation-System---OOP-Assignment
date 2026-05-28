[5/17/2026 6:09 PM] Hsn: get to google and search https://github.com/hassendalu1/Simple-bank-system..git
[5/28/2026 11:34 AM] Hsn: public class TemperatureSensor extends Device {

    private double temperature;

    public TemperatureSensor(String deviceName) {
        super(deviceName);
        temperature = 22.5;
    }

    @Override
    public void turnOn() {
        setStatus(true);
        System.out.println(getDeviceName() +
                " sensor activated");
    }

    @Override
    public void displayStatus() {
        System.out.println("Temperature Sensor -> " +
                getDeviceName() +
                " : " +
                temperature + "°C");
    }
}
