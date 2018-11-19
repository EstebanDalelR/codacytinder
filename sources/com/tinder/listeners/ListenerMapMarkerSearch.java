package com.tinder.listeners;

import com.google.android.m4b.maps.model.Marker;
import com.tinder.passport.model.PassportLocation;

public interface ListenerMapMarkerSearch {
    void onLocationMarkerError(Marker marker);

    void onLocationMarkerResult(PassportLocation passportLocation, Marker marker);
}
