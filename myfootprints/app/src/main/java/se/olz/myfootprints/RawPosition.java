package se.olz.myfootprints;

public class RawPosition {
    private int id;
    private long session;
    private long accessedTimestamp;
    private double latitude;
    private double longitude;

    RawPosition(
            int id,
            long session,
            long accessedTimestamp,
            double latitude,
            double longitude) {
        this.id = id;
        this.session = session;
        this.accessedTimestamp = accessedTimestamp;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String toString() {
        return id + ", " + session + ", " + accessedTimestamp + ", " + latitude + ", " + longitude;
    }

    public int getId() {
        return id;
    }

    public long getSession() {
        return session;
    }

    public long getAccessedTimestamp() {
        return accessedTimestamp;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
