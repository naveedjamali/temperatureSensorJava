public class OldSensorDevice {
    SensorDevice device;

    public OldSensorDevice(SensorDevice device) {
        this.device = device;
    }

    public void start() {
        device.start();
    }
}

