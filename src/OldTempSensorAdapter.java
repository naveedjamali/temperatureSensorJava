
interface TemperatureSensor {

    default double getReading() {
        return 0;
    }
}

class OldTempSensorAdapter extends SensorDevice implements TemperatureSensor {
    String id;
    private double reading = 0;

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public double getReading() {
        return reading;
    }

    @Override
    public void start() {
        /**
         * Starts device and updates reading.
         */
        reading = 36;
    }

    @Override
    public void stop() {
        /**
         *Stop the device.
         */
        reading = 0;
    }
}


abstract class SensorDevice {

    public abstract void start();

    public abstract void stop();
}
