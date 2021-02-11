package seminar.half2.sem1;

import seminar.half2.sem1.iface.Sensor;

import java.util.ArrayList;
import java.util.List;

public class SensorService {
    public static List<Sensor> checkSensorsState(List<Sensor> sensors, SensorState state) {
        List<Sensor> filteredSensors = new ArrayList<Sensor>();
        for (Sensor item : sensors) {
            if (item.getState() == state) {
                filteredSensors.add(item);
            }
        }
        return filteredSensors;
    }

    public static void disableAllSensors(List<Sensor> sensors) {
        for (Sensor item: sensors){
            item.disableSensor();
        }
    }

}
