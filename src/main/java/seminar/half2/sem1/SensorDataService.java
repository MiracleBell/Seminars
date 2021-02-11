package seminar.half2.sem1;


import java.util.ArrayList;
import java.util.List;

public class SensorDataService {
    public static List<SensorData> getInArea(List<SensorData> sensors, double radius, LocationImpl location) {
        List<SensorData> resultList = new ArrayList<>();
        for (SensorData item : sensors) {
            if (item.getSensor().getLocation().getDistance(location) <= radius) {
                resultList.add(item);
            }
        }
        return resultList;
    }
}
