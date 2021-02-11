package seminar.half2.sem1.iface;

import seminar.half2.sem1.SensorState;
import seminar.half2.sem1.SensorType;

public interface Sensor {
    int getId();

    SensorType getType();

    Location getLocation();

    SensorState getState();

    String getName();

    void enableSensor();

    void disableSensor();
}
