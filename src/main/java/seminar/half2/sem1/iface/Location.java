package seminar.half2.sem1.iface;

import seminar.half2.sem1.LocationImpl;

public interface Location {
    double getLatitude();

    double getLongitude();

    double getDistance(LocationImpl other);
}
