package com.mapbox.mapboxsdk.style.layers;

import android.support.annotation.NonNull;
import com.google.gson.JsonElement;
import com.mapbox.mapboxsdk.style.expressions.Expression;

public abstract class Layer {
    private boolean invalidated;
    private long nativePtr;

    protected native void finalize() throws Throwable;

    protected native JsonElement nativeGetFilter();

    protected native String nativeGetId();

    protected native float nativeGetMaxZoom();

    protected native float nativeGetMinZoom();

    protected native String nativeGetSourceLayer();

    protected native Object nativeGetVisibility();

    protected native void nativeSetFilter(Object[] objArr);

    protected native void nativeSetLayoutProperty(String str, Object obj);

    protected native void nativeSetMaxZoom(float f);

    protected native void nativeSetMinZoom(float f);

    protected native void nativeSetPaintProperty(String str, Object obj);

    protected native void nativeSetSourceLayer(String str);

    public Layer(long j) {
        this.nativePtr = j;
    }

    public void setProperties(@NonNull PropertyValue<?>... propertyValueArr) {
        if (propertyValueArr.length != 0) {
            for (PropertyValue propertyValue : propertyValueArr) {
                Object convertValue = convertValue(propertyValue.value);
                if (propertyValue instanceof PaintPropertyValue) {
                    nativeSetPaintProperty(propertyValue.name, convertValue);
                } else {
                    nativeSetLayoutProperty(propertyValue.name, convertValue);
                }
            }
        }
    }

    public String getId() {
        return nativeGetId();
    }

    public PropertyValue<String> getVisibility() {
        return new PaintPropertyValue("visibility", (String) nativeGetVisibility());
    }

    public float getMinZoom() {
        return nativeGetMinZoom();
    }

    public float getMaxZoom() {
        return nativeGetMaxZoom();
    }

    public void setMinZoom(float f) {
        nativeSetMinZoom(f);
    }

    public void setMaxZoom(float f) {
        nativeSetMaxZoom(f);
    }

    public long getNativePtr() {
        return this.nativePtr;
    }

    private Object convertValue(Object obj) {
        return (obj == null || !(obj instanceof Expression)) ? obj : ((Expression) obj).toArray();
    }
}
