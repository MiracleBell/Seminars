package seminar.half2.sem1;

import seminar.half2.sem1.iface.Location;

public class LocationImpl implements Location {
    private double latitude;
    private double longitude;

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getDistance(LocationImpl other) {
        return Math.sqrt(Math.pow(other.getLatitude() - latitude, 2) +
                Math.pow(other.getLongitude() - longitude, 2));
    }
}
