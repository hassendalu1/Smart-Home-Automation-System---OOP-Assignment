import java.util.ArrayList;

public class SmartHome {

    private ArrayList<Device> devices = new ArrayList<>();

    public void addDevice(Device device) {
        devices.add(device);
    }

    public void showAllDevices() {

        for (Device device : devices) {
            device.displayStatus();
        }
    }
}
