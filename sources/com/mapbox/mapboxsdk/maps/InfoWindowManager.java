package com.mapbox.mapboxsdk.maps;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.mapbox.mapboxsdk.annotations.InfoWindow;
import com.mapbox.mapboxsdk.annotations.Marker;
import com.mapbox.mapboxsdk.maps.MapboxMap.InfoWindowAdapter;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnInfoWindowClickListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnInfoWindowCloseListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnInfoWindowLongClickListener;
import java.util.ArrayList;
import java.util.List;

class InfoWindowManager {
    private boolean allowConcurrentMultipleInfoWindows;
    private InfoWindowAdapter infoWindowAdapter;
    private final List<InfoWindow> infoWindows = new ArrayList();
    private OnInfoWindowClickListener onInfoWindowClickListener;
    private OnInfoWindowCloseListener onInfoWindowCloseListener;
    private OnInfoWindowLongClickListener onInfoWindowLongClickListener;

    InfoWindowManager() {
    }

    void update() {
        if (!this.infoWindows.isEmpty()) {
            for (InfoWindow update : this.infoWindows) {
                update.update();
            }
        }
    }

    void setInfoWindowAdapter(@Nullable InfoWindowAdapter infoWindowAdapter) {
        this.infoWindowAdapter = infoWindowAdapter;
    }

    InfoWindowAdapter getInfoWindowAdapter() {
        return this.infoWindowAdapter;
    }

    void setAllowConcurrentMultipleOpenInfoWindows(boolean z) {
        this.allowConcurrentMultipleInfoWindows = z;
    }

    boolean isAllowConcurrentMultipleOpenInfoWindows() {
        return this.allowConcurrentMultipleInfoWindows;
    }

    boolean isInfoWindowValidForMarker(Marker marker) {
        return (marker == null || (TextUtils.isEmpty(marker.getTitle()) && TextUtils.isEmpty(marker.getSnippet()) != null)) ? null : true;
    }

    void setOnInfoWindowClickListener(@Nullable OnInfoWindowClickListener onInfoWindowClickListener) {
        this.onInfoWindowClickListener = onInfoWindowClickListener;
    }

    OnInfoWindowClickListener getOnInfoWindowClickListener() {
        return this.onInfoWindowClickListener;
    }

    void setOnInfoWindowLongClickListener(@Nullable OnInfoWindowLongClickListener onInfoWindowLongClickListener) {
        this.onInfoWindowLongClickListener = onInfoWindowLongClickListener;
    }

    OnInfoWindowLongClickListener getOnInfoWindowLongClickListener() {
        return this.onInfoWindowLongClickListener;
    }

    void setOnInfoWindowCloseListener(@Nullable OnInfoWindowCloseListener onInfoWindowCloseListener) {
        this.onInfoWindowCloseListener = onInfoWindowCloseListener;
    }

    OnInfoWindowCloseListener getOnInfoWindowCloseListener() {
        return this.onInfoWindowCloseListener;
    }

    public void add(InfoWindow infoWindow) {
        this.infoWindows.add(infoWindow);
    }
}
