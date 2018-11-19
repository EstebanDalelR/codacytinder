package com.mapbox.android.telemetry;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.support.annotation.NonNull;

class LocationReceiver extends BroadcastReceiver {
    private static final String LOCATION_RECEIVED_INTENT_KEY = "location_received";
    static final String LOCATION_RECEIVER_INTENT = "com.mapbox.location_receiver";
    private static final String ON_LOCATION_INTENT_EXTRA = "onLocation";
    private final EventCallback callback;
    private LocationMapper locationMapper = null;

    LocationReceiver(@NonNull EventCallback eventCallback) {
        this.callback = eventCallback;
    }

    public void onReceive(Context context, Intent intent) {
        if (ON_LOCATION_INTENT_EXTRA.equals(intent.getStringExtra(LOCATION_RECEIVED_INTENT_KEY)) != null) {
            sendEvent((Location) intent.getExtras().get("location"));
        }
    }

    static Intent supplyIntent(Location location) {
        Intent intent = new Intent(LOCATION_RECEIVER_INTENT);
        intent.putExtra(LOCATION_RECEIVED_INTENT_KEY, ON_LOCATION_INTENT_EXTRA);
        intent.putExtra("location", location);
        return intent;
    }

    void updateSessionIdentifier(SessionIdentifier sessionIdentifier) {
        this.locationMapper.updateSessionIdentifier(sessionIdentifier);
    }

    private boolean sendEvent(Location location) {
        if (!isThereAnyNaN(location)) {
            if (!isThereAnyInfinite(location)) {
                this.callback.onEventReceived(obtainLocationMapper().from(location));
                return true;
            }
        }
        return null;
    }

    private boolean isThereAnyNaN(Location location) {
        if (!(Double.isNaN(location.getLatitude()) || Double.isNaN(location.getLongitude()) || Double.isNaN(location.getAltitude()))) {
            if (Float.isNaN(location.getAccuracy()) == null) {
                return null;
            }
        }
        return true;
    }

    private boolean isThereAnyInfinite(Location location) {
        if (!(Double.isInfinite(location.getLatitude()) || Double.isInfinite(location.getLongitude()) || Double.isInfinite(location.getAltitude()))) {
            if (Float.isInfinite(location.getAccuracy()) == null) {
                return null;
            }
        }
        return true;
    }

    private LocationMapper obtainLocationMapper() {
        if (this.locationMapper == null) {
            this.locationMapper = new LocationMapper();
        }
        return this.locationMapper;
    }
}
