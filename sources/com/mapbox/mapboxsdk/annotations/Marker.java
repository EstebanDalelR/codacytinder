package com.mapbox.mapboxsdk.annotations;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import com.mapbox.mapboxsdk.C5812R;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.maps.MapView;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.MapboxMap.InfoWindowAdapter;

public class Marker extends Annotation {
    private Icon icon;
    private String iconId;
    private InfoWindow infoWindow;
    private boolean infoWindowShown;
    private LatLng position;
    private int rightOffsetPixels;
    private String snippet;
    private String title;
    private int topOffsetPixels;

    Marker() {
    }

    public Marker(BaseMarkerOptions baseMarkerOptions) {
        this(baseMarkerOptions.position, baseMarkerOptions.icon, baseMarkerOptions.title, baseMarkerOptions.snippet);
    }

    Marker(BaseMarkerViewOptions baseMarkerViewOptions) {
        this(baseMarkerViewOptions.position, baseMarkerViewOptions.icon, baseMarkerViewOptions.title, baseMarkerViewOptions.snippet);
    }

    Marker(LatLng latLng, Icon icon, String str, String str2) {
        this.position = latLng;
        this.title = str;
        this.snippet = str2;
        setIcon(icon);
    }

    public LatLng getPosition() {
        return this.position;
    }

    public String getSnippet() {
        return this.snippet;
    }

    public String getTitle() {
        return this.title;
    }

    public void hideInfoWindow() {
        if (this.infoWindow != null) {
            this.infoWindow.close();
        }
        this.infoWindowShown = false;
    }

    public boolean isInfoWindowShown() {
        return this.infoWindowShown;
    }

    public void setPosition(LatLng latLng) {
        this.position = latLng;
        latLng = getMapboxMap();
        if (latLng != null) {
            latLng.updateMarker(this);
        }
    }

    public void setSnippet(String str) {
        this.snippet = str;
        refreshInfoWindowContent();
    }

    public void setIcon(@Nullable Icon icon) {
        this.icon = icon;
        this.iconId = icon != null ? icon.getId() : null;
        icon = getMapboxMap();
        if (icon != null) {
            icon.updateMarker(this);
        }
    }

    public Icon getIcon() {
        return this.icon;
    }

    public void setTitle(String str) {
        this.title = str;
        refreshInfoWindowContent();
    }

    @Nullable
    public InfoWindow getInfoWindow() {
        return this.infoWindow;
    }

    private void refreshInfoWindowContent() {
        if (isInfoWindowShown() && this.mapView != null && this.mapboxMap != null && this.mapboxMap.getInfoWindowAdapter() == null) {
            InfoWindow infoWindow = getInfoWindow(this.mapView);
            if (this.mapView.getContext() != null) {
                infoWindow.adaptDefaultMarker(this, this.mapboxMap, this.mapView);
            }
            MapboxMap mapboxMap = getMapboxMap();
            if (mapboxMap != null) {
                mapboxMap.updateMarker(this);
            }
            infoWindow.update();
        }
    }

    public InfoWindow showInfoWindow(@NonNull MapboxMap mapboxMap, @NonNull MapView mapView) {
        setMapboxMap(mapboxMap);
        setMapView(mapView);
        InfoWindowAdapter infoWindowAdapter = getMapboxMap().getInfoWindowAdapter();
        if (infoWindowAdapter != null) {
            View infoWindow = infoWindowAdapter.getInfoWindow(this);
            if (infoWindow != null) {
                this.infoWindow = new InfoWindow(infoWindow, mapboxMap);
                showInfoWindow(this.infoWindow, mapView);
                return this.infoWindow;
            }
        }
        InfoWindow infoWindow2 = getInfoWindow(mapView);
        if (mapView.getContext() != null) {
            infoWindow2.adaptDefaultMarker(this, mapboxMap, mapView);
        }
        return showInfoWindow(infoWindow2, mapView);
    }

    private InfoWindow showInfoWindow(InfoWindow infoWindow, MapView mapView) {
        infoWindow.open(mapView, this, getPosition(), this.rightOffsetPixels, this.topOffsetPixels);
        this.infoWindowShown = true;
        return infoWindow;
    }

    private InfoWindow getInfoWindow(@NonNull MapView mapView) {
        if (this.infoWindow == null && mapView.getContext() != null) {
            this.infoWindow = new InfoWindow(mapView, C5812R.layout.mapbox_infowindow_content, getMapboxMap());
        }
        return this.infoWindow;
    }

    public void setTopOffsetPixels(int i) {
        this.topOffsetPixels = i;
    }

    public void setRightOffsetPixels(int i) {
        this.rightOffsetPixels = i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Marker [position[");
        stringBuilder.append(getPosition());
        stringBuilder.append("]]");
        return stringBuilder.toString();
    }
}
