package com.tinder.utils;

import android.support.annotation.NonNull;
import com.google.android.m4b.maps.model.LatLng;

public interface LatLngInterpolator {

    /* renamed from: com.tinder.utils.LatLngInterpolator$a */
    public static class C17229a implements LatLngInterpolator {
        @NonNull
        public LatLng interpolate(float f, @NonNull LatLng latLng, @NonNull LatLng latLng2) {
            double d = (double) f;
            return new LatLng(((latLng2.latitude - latLng.latitude) * d) + latLng.latitude, ((latLng2.longitude - latLng.longitude) * d) + latLng.longitude);
        }
    }

    @NonNull
    LatLng interpolate(float f, LatLng latLng, LatLng latLng2);
}
