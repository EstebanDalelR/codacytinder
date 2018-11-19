package com.tinder.events;

import android.location.Location;

public class EventLocationSet {
    public boolean firstCache;
    public double latitute;
    private final Location location;
    public double longitude;

    public EventLocationSet(Location location, boolean z) {
        this.latitute = location.getLatitude();
        this.longitude = location.getLongitude();
        this.firstCache = z;
        this.location = location;
    }

    public Location location() {
        return this.location;
    }
}
