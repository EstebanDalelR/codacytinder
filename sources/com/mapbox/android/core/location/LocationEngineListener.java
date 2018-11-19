package com.mapbox.android.core.location;

import android.location.Location;

public interface LocationEngineListener {
    void onConnected();

    void onLocationChanged(Location location);
}
