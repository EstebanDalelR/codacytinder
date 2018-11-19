package com.mapbox.mapboxsdk.annotations;

import android.support.annotation.FloatRange;
import android.support.annotation.Nullable;
import com.mapbox.mapboxsdk.Mapbox;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.maps.MapboxMap;

@Deprecated
public class MarkerView extends Marker {
    private float alpha = 1.0f;
    private float anchorU;
    private float anchorV;
    private boolean flat;
    private float height;
    private float infoWindowAnchorU;
    private float infoWindowAnchorV;
    private Icon markerViewIcon;
    private MarkerViewManager markerViewManager;
    private float offsetX = -1.0f;
    private float offsetY = -1.0f;
    private float rotation;
    private boolean selected;
    private float tiltValue;
    private boolean visible = true;
    private float width;

    MarkerView() {
    }

    public MarkerView(BaseMarkerViewOptions baseMarkerViewOptions) {
        super(baseMarkerViewOptions);
        this.alpha = baseMarkerViewOptions.getAlpha();
        this.anchorU = baseMarkerViewOptions.getAnchorU();
        this.anchorV = baseMarkerViewOptions.getAnchorV();
        this.infoWindowAnchorU = baseMarkerViewOptions.getInfoWindowAnchorU();
        this.infoWindowAnchorV = baseMarkerViewOptions.getInfoWindowAnchorV();
        this.flat = baseMarkerViewOptions.isFlat();
        this.rotation = baseMarkerViewOptions.getRotation();
        this.selected = baseMarkerViewOptions.selected;
    }

    float getWidth() {
        return this.width;
    }

    void setWidth(float f) {
        this.width = f;
    }

    float getHeight() {
        return this.height;
    }

    void setHeight(float f) {
        this.height = f;
    }

    public void setAnchor(@FloatRange(from = 0.0d, to = 1.0d) float f, @FloatRange(from = 0.0d, to = 1.0d) float f2) {
        this.anchorU = f;
        this.anchorV = f2;
        setOffset(-1.0f, -1.0f);
    }

    public float getAnchorU() {
        return this.anchorU;
    }

    public float getAnchorV() {
        return this.anchorV;
    }

    void setOffset(float f, float f2) {
        this.offsetX = f;
        this.offsetY = f2;
    }

    float getOffsetX() {
        return this.offsetX;
    }

    float getOffsetY() {
        return this.offsetY;
    }

    public void setInfoWindowAnchor(@FloatRange(from = 0.0d, to = 1.0d) float f, @FloatRange(from = 0.0d, to = 1.0d) float f2) {
        this.infoWindowAnchorU = f;
        this.infoWindowAnchorV = f2;
    }

    public float getInfoWindowAnchorU() {
        return this.infoWindowAnchorU;
    }

    public float getInfoWindowAnchorV() {
        return this.infoWindowAnchorV;
    }

    public boolean isFlat() {
        return this.flat;
    }

    public void setFlat(boolean z) {
        this.flat = z;
    }

    float getTilt() {
        return this.tiltValue;
    }

    void setTilt(@FloatRange(from = 0.0d, to = 60.0d) float f) {
        this.tiltValue = f;
    }

    public void setVisible(boolean z) {
        this.visible = z;
        if (this.markerViewManager != null) {
            this.markerViewManager.animateVisible(this, z);
        }
    }

    public boolean isVisible() {
        return this.visible;
    }

    public void setRotation(float f) {
        this.rotation = f;
        if (this.markerViewManager != null) {
            this.markerViewManager.setRotation(this, f);
        }
    }

    public float getRotation() {
        return this.rotation;
    }

    public float getAlpha() {
        return this.alpha;
    }

    public void setAlpha(@FloatRange(from = 0.0d, to = 255.0d) float f) {
        this.alpha = f;
        if (this.markerViewManager != null) {
            this.markerViewManager.animateAlpha(this, f);
        }
    }

    public void setIcon(@Nullable Icon icon) {
        if (icon != null) {
            this.markerViewIcon = IconFactory.recreate(IconFactory.ICON_MARKERVIEW_ID, icon.getBitmap());
        }
        icon = IconFactory.recreate(IconFactory.ICON_MARKERVIEW_ID, IconFactory.ICON_MARKERVIEW_BITMAP);
        if (this.markerViewManager != null) {
            this.markerViewManager.updateIcon(this);
        }
        super.setIcon(icon);
    }

    public void setPosition(LatLng latLng) {
        super.setPosition(latLng);
        if (this.markerViewManager != null) {
            this.markerViewManager.setWaitingForRenderInvoke(true);
            this.markerViewManager.update();
        }
    }

    public boolean isSelected() {
        return this.selected;
    }

    void setSelected(boolean z) {
        this.selected = z;
    }

    public Icon getIcon() {
        if (this.markerViewIcon == null) {
            setIcon(IconFactory.getInstance(Mapbox.getApplicationContext()).defaultMarkerView());
        }
        return this.markerViewIcon;
    }

    public void setMapboxMap(MapboxMap mapboxMap) {
        super.setMapboxMap(mapboxMap);
        if (mapboxMap != null) {
            if (isFlat()) {
                this.tiltValue = (float) mapboxMap.getCameraPosition().tilt;
            }
            this.markerViewManager = mapboxMap.getMarkerViewManager();
        }
    }

    void invalidate() {
        this.height = 0.0f;
        this.width = 0.0f;
        this.offsetY = -1.0f;
        this.offsetX = -1.0f;
        this.markerViewManager.invalidateViewMarkersInVisibleRegion();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MarkerView [position[");
        stringBuilder.append(getPosition());
        stringBuilder.append("]]");
        return stringBuilder.toString();
    }
}
