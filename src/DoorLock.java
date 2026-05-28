public class DoorLock extends Device {

    public DoorLock(String deviceName) {
        super(deviceName);
    }

    @Override
    public void turnOn() {
        setStatus(true);
        System.out.println(getDeviceName() + " door is LOCKED");
    }

    @Override
    public void turnOff() {
        setStatus(false);
        System.out.println(getDeviceName() + " door is UNLOCKED");
    }

    @Override
    public void displayStatus() {
        System.out.println("Door Lock -> " +
                getDeviceName() +
                " : " +
                (getStatus() ? "LOCKED" : "UNLOCKED"));
    }
}