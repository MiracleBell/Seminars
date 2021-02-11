package seminar.half2.sem1;

import seminar.half2.sem1.iface.Location;
import seminar.half2.sem1.iface.Sensor;

public class SensorImpl implements Sensor {
    private int id;
    private SensorType type;
    private Location location;
    private SensorState state;
    private String name;
    private boolean active;

    public int getId() {
        return id;
    }

    public SensorType getType() {
        return type;
    }

    public Location getLocation() {
        return location;
    }

    public SensorState getState() {
        return state;
    }

    public String getName() {
        return name;
    }

    public void enableSensor() {
        active = true;
    }

    public void disableSensor() {
        active = false;
    }
}
