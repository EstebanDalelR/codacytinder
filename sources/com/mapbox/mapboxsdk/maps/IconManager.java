package com.mapbox.mapboxsdk.maps;

import android.graphics.Bitmap;
import com.mapbox.mapboxsdk.Mapbox;
import com.mapbox.mapboxsdk.annotations.Icon;
import com.mapbox.mapboxsdk.annotations.IconFactory;
import com.mapbox.mapboxsdk.annotations.Marker;
import com.mapbox.mapboxsdk.annotations.MarkerView;
import java.util.HashMap;
import java.util.Map;

class IconManager {
    private int highestIconHeight;
    private int highestIconWidth;
    private final Map<Icon, Integer> iconMap = new HashMap();
    private NativeMapView nativeMapView;

    IconManager(NativeMapView nativeMapView) {
        this.nativeMapView = nativeMapView;
        loadIcon(IconFactory.recreate(IconFactory.ICON_MARKERVIEW_ID, IconFactory.ICON_MARKERVIEW_BITMAP));
    }

    Icon loadIconForMarker(Marker marker) {
        Icon icon = marker.getIcon();
        if (icon == null) {
            icon = loadDefaultIconForMarker(marker);
        } else {
            updateHighestIconSize(icon);
        }
        addIcon(icon);
        return icon;
    }

    void loadIconForMarkerView(MarkerView markerView) {
        markerView = markerView.getIcon();
        updateHighestIconSize(markerView.getBitmap());
        addIcon(markerView, false);
    }

    int getTopOffsetPixelsForIcon(Icon icon) {
        return (int) (this.nativeMapView.getTopOffsetPixelsForAnnotationSymbol(icon.getId()) * ((double) this.nativeMapView.getPixelRatio()));
    }

    int getHighestIconWidth() {
        return this.highestIconWidth;
    }

    int getHighestIconHeight() {
        return this.highestIconHeight;
    }

    private Icon loadDefaultIconForMarker(Marker marker) {
        Icon defaultMarker = IconFactory.getInstance(Mapbox.getApplicationContext()).defaultMarker();
        Bitmap bitmap = defaultMarker.getBitmap();
        updateHighestIconSize(bitmap.getWidth(), bitmap.getHeight() / 2);
        marker.setIcon(defaultMarker);
        return defaultMarker;
    }

    private void addIcon(Icon icon) {
        addIcon(icon, true);
    }

    private void addIcon(Icon icon, boolean z) {
        if (this.iconMap.keySet().contains(icon)) {
            this.iconMap.put(icon, Integer.valueOf(((Integer) this.iconMap.get(icon)).intValue() + 1));
            return;
        }
        this.iconMap.put(icon, Integer.valueOf(1));
        if (z) {
            loadIcon(icon);
        }
    }

    private void updateHighestIconSize(Icon icon) {
        updateHighestIconSize(icon.getBitmap());
    }

    private void updateHighestIconSize(Bitmap bitmap) {
        updateHighestIconSize(bitmap.getWidth(), bitmap.getHeight());
    }

    private void updateHighestIconSize(int i, int i2) {
        if (i > this.highestIconWidth) {
            this.highestIconWidth = i;
        }
        if (i2 > this.highestIconHeight) {
            this.highestIconHeight = i2;
        }
    }

    private void loadIcon(Icon icon) {
        Bitmap bitmap = icon.getBitmap();
        this.nativeMapView.addAnnotationIcon(icon.getId(), bitmap.getWidth(), bitmap.getHeight(), icon.getScale(), icon.toBytes());
    }

    void reloadIcons() {
        for (Icon loadIcon : this.iconMap.keySet()) {
            loadIcon(loadIcon);
        }
    }

    void ensureIconLoaded(Marker marker, MapboxMap mapboxMap) {
        Icon icon = marker.getIcon();
        if (icon == null) {
            icon = loadDefaultIconForMarker(marker);
        }
        addIcon(icon);
        setTopOffsetPixels(marker, mapboxMap, icon);
    }

    private void setTopOffsetPixels(Marker marker, MapboxMap mapboxMap, Icon icon) {
        mapboxMap = marker.getId() != -1 ? (Marker) mapboxMap.getAnnotation(marker.getId()) : null;
        if (mapboxMap == null || mapboxMap.getIcon() == null || mapboxMap.getIcon() != marker.getIcon()) {
            marker.setTopOffsetPixels(getTopOffsetPixelsForIcon(icon));
        }
    }

    void iconCleanup(Icon icon) {
        Integer num = (Integer) this.iconMap.get(icon);
        if (num != null) {
            num = Integer.valueOf(num.intValue() - 1);
            if (num.intValue() == 0) {
                remove(icon);
            } else {
                updateIconRefCounter(icon, num.intValue());
            }
        }
    }

    private void remove(Icon icon) {
        this.nativeMapView.removeAnnotationIcon(icon.getId());
        this.iconMap.remove(icon);
    }

    private void updateIconRefCounter(Icon icon, int i) {
        this.iconMap.put(icon, Integer.valueOf(i));
    }
}
