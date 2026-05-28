public class Device {

    // Encapsulation
    private String deviceName;
    private boolean status;

    public Device(String deviceName) {
        this.deviceName = deviceName;
        this.status = false;
    }

    // Getters
    public String getDeviceName() {
        return deviceName;
    }

    public boolean getStatus() {
        return status;
    }

    // Setters
    public void setDeviceName(String deviceName) {
        if (!deviceName.isEmpty()) {
            this.deviceName = deviceName;
        }
    }

    protected void setStatus(boolean status) {
        this.status = status;
    }

    public void turnOn() {
        setStatus(true);
        System.out.println(deviceName + " is ON");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println(deviceName + " is OFF");
    }

    public void displayStatus() {
        System.out.println(deviceName + " Status: " + (status ? "ON" : "OFF"));
    }
}