package seminar.half2.sem1;

import seminar.half2.sem1.iface.Sensor;

import java.time.LocalDateTime;
import java.util.Objects;

public class SensorData {
    private Sensor sensor;
    private double value;
    private LocalDateTime date;

    public SensorData(Sensor sensor, double value, LocalDateTime date) {
        if (sensor == null || date == null) {
            throw new NullPointerException("Nooooooooooooooooooooo!");
        }
        this.sensor = sensor;
        this.value = value;
        this.date = date;
    }

    public Sensor getSensor() {
        return sensor;
    }

    public double getValue() {
        return value;
    }

    public LocalDateTime getDate() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SensorData that = (SensorData) o;
        return Double.compare(that.value, value) == 0 && sensor.equals(that.sensor) && date.equals(that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sensor, value, date);
    }
}
