package com.mapbox.android.telemetry;

import android.location.Location;
import java.math.BigDecimal;

class LocationMapper {
    private static final double MAX_LONGITUDE = 180.0d;
    private static final double MIN_LONGITUDE = -180.0d;
    private static final int SEVEN_DIGITS_AFTER_DECIMAL = 7;
    private SessionIdentifier sessionIdentifier = new SessionIdentifier();

    private double wrap(double d, double d2, double d3) {
        d3 -= d2;
        return ((((d - d2) % d3) + d3) % d3) + d2;
    }

    LocationMapper() {
    }

    LocationEvent from(Location location) {
        return createLocationEvent(location);
    }

    void updateSessionIdentifier(SessionIdentifier sessionIdentifier) {
        this.sessionIdentifier = sessionIdentifier;
    }

    private LocationEvent createLocationEvent(Location location) {
        LocationEvent locationEvent = new LocationEvent(this.sessionIdentifier.getSessionId(), round(location.getLatitude()), wrapLongitude(round(location.getLongitude())));
        addAltitudeIfPresent(location, locationEvent);
        addAccuracyIfPresent(location, locationEvent);
        return locationEvent;
    }

    private double round(double d) {
        return new BigDecimal(d).setScale(3.5E-323d, 1).doubleValue();
    }

    private double wrapLongitude(double d) {
        return (d < -180.0d || d > 180.0d) ? wrap(d, -180.0d, 180.0d) : d;
    }

    private void addAltitudeIfPresent(Location location, LocationEvent locationEvent) {
        if (location.hasAltitude()) {
            locationEvent.setAltitude(Double.valueOf((double) Math.round(location.getAltitude())));
        }
    }

    private void addAccuracyIfPresent(Location location, LocationEvent locationEvent) {
        if (location.hasAccuracy()) {
            locationEvent.setAccuracy(Float.valueOf((float) Math.round(location.getAccuracy())));
        }
    }
}
