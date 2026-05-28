public class Light extends Device {

    public Light(String deviceName) {
        super(deviceName);
    }

    @Override
    public void turnOn() {
        setStatus(true);
        System.out.println(getDeviceName() + " light is now ON");
    }

    @Override
    public void displayStatus() {
        System.out.println("Light -> " +
                getDeviceName() +
                " : " +
                (getStatus() ? "ON" : "OFF"));
    }
}