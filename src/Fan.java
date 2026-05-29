public class Fan extends Device {

    private int speed;

    public Fan(String deviceName) {
        super(deviceName);
        speed = 1;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setSpeed() {
        this.speed = 3;
    }

    @Override
    public void turnOn() {
        setStatus(true);
        System.out.println(getDeviceName() +
                " fan is ON at speed " + speed);
    }

    @Override
    public void displayStatus() {
        System.out.println("Fan -> " +
                getDeviceName() +
                " : " +
                (getStatus() ? "ON" : "OFF") +
                ", Speed: " + speed);
    }
}
