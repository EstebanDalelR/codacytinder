package com.mapbox.mapboxsdk.annotations;

import android.os.Parcelable;
import com.mapbox.mapboxsdk.geometry.LatLng;

public abstract class BaseMarkerOptions<U extends Marker, T extends BaseMarkerOptions<U, T>> implements Parcelable {
    protected Icon icon;
    protected LatLng position;
    protected String snippet;
    protected String title;

    public abstract U getMarker();

    public abstract T getThis();

    public T position(LatLng latLng) {
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

    public T setIcon(Icon icon) {
        return icon(icon);
    }

    public T setPosition(LatLng latLng) {
        return position(latLng);
    }

    public T setSnippet(String str) {
        return snippet(str);
    }

    public T setTitle(String str) {
        return title(str);
    }
}
