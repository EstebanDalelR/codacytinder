package com.mapbox.mapboxsdk.annotations;

import android.os.Parcelable;
import android.support.annotation.FloatRange;
import android.support.annotation.NonNull;
import com.mapbox.mapboxsdk.geometry.LatLng;

@Deprecated
public abstract class BaseMarkerViewOptions<U extends MarkerView, T extends BaseMarkerViewOptions<U, T>> implements Parcelable {
    protected float alpha = 1.0f;
    protected float anchorU = 0.5f;
    protected float anchorV = 1.0f;
    protected boolean flat;
    protected Icon icon;
    protected float infoWindowAnchorU = 0.5f;
    protected float infoWindowAnchorV = 0.0f;
    protected LatLng position;
    protected float rotation;
    protected boolean selected;
    protected String snippet;
    protected String title;
    protected boolean visible = true;

    public abstract U getMarker();

    public abstract T getThis();

    public T position(@NonNull LatLng latLng) {
        this.position = latLng;
        return getThis();
    }

    public T snippet(String str) {
        this.snippet = str;
        return getThis();
    }

    public T title(String str) {
        this.title = str;
        return getThis();
    }

    public T icon(Icon icon) {
        this.icon = icon;
        return getThis();
    }

    public T flat(boolean z) {
        this.flat = z;
        return getThis();
    }

    public T anchor(@FloatRange(from = 0.0d, to = 1.0d) float f, @FloatRange(from = 0.0d, to = 1.0d) float f2) {
        this.anchorU = f;
        this.anchorV = f2;
        return getThis();
    }

    public T infoWindowAnchor(@FloatRange(from = 0.0d, to = 1.0d) float f, @FloatRange(from = 0.0d, to = 1.0d) float f2) {
        this.infoWindowAnchorU = f;
        this.infoWindowAnchorV = f2;
        return getThis();
    }

    public T rotation(float f) {
        this.rotation = f;
        while (this.rotation > 360.0f) {
            this.rotation -= 360.0f;
        }
        while (this.rotation < 0.0f) {
            this.rotation += 360.0f;
        }
        return getThis();
    }

    public T visible(boolean z) {
        this.visible = z;
        return getThis();
    }

    public T alpha(float f) {
        this.alpha = f;
        return getThis();
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

    public Icon getIcon() {
        return this.icon;
    }

    public boolean isFlat() {
        return this.flat;
    }

    public float getAnchorU() {
        return this.anchorU;
    }

    public float getAnchorV() {
        return this.anchorV;
    }

    public float getInfoWindowAnchorU() {
        return this.infoWindowAnchorU;
    }

    public float getInfoWindowAnchorV() {
        return this.infoWindowAnchorV;
    }

    public float getRotation() {
        return this.rotation;
    }

    public boolean isVisible() {
        return this.visible;
    }

    public float getAlpha() {
        return this.alpha;
    }
}
