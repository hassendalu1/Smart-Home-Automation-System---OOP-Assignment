public class TemperatureSensor extends Device {

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
