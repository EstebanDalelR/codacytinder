package com.mapbox.mapboxsdk.style.layers;

import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.UiThread;
import com.google.gson.JsonArray;
import com.mapbox.mapboxsdk.style.expressions.Expression;
import com.mapbox.mapboxsdk.style.expressions.Expression.Converter;
import com.mapbox.mapboxsdk.utils.ColorUtils;

@UiThread
public class HeatmapLayer extends Layer {
    private native Object nativeGetHeatmapColor();

    private native Object nativeGetHeatmapIntensity();

    private native TransitionOptions nativeGetHeatmapIntensityTransition();

    private native Object nativeGetHeatmapOpacity();

    private native TransitionOptions nativeGetHeatmapOpacityTransition();

    private native Object nativeGetHeatmapRadius();

    private native TransitionOptions nativeGetHeatmapRadiusTransition();

    private native Object nativeGetHeatmapWeight();

    private native void nativeSetHeatmapIntensityTransition(long j, long j2);

    private native void nativeSetHeatmapOpacityTransition(long j, long j2);

    private native void nativeSetHeatmapRadiusTransition(long j, long j2);

    protected native void finalize() throws Throwable;

    protected native void initialize(String str, String str2);

    public HeatmapLayer(long j) {
        super(j);
    }

    public HeatmapLayer(String str, String str2) {
        initialize(str, str2);
    }

    public void setSourceLayer(String str) {
        nativeSetSourceLayer(str);
    }

    public HeatmapLayer withSourceLayer(String str) {
        setSourceLayer(str);
        return this;
    }

    public String getSourceLayer() {
        return nativeGetSourceLayer();
    }

    public void setFilter(Expression expression) {
        nativeSetFilter(expression.toArray());
    }

    public HeatmapLayer withFilter(Expression expression) {
        setFilter(expression);
        return this;
    }

    @Nullable
    public Expression getFilter() {
        JsonArray jsonArray = (JsonArray) nativeGetFilter();
        return jsonArray != null ? Converter.convert(jsonArray) : null;
    }

    public HeatmapLayer withProperties(@NonNull PropertyValue<?>... propertyValueArr) {
        setProperties(propertyValueArr);
        return this;
    }

    public PropertyValue<Float> getHeatmapRadius() {
        return new PropertyValue("heatmap-radius", nativeGetHeatmapRadius());
    }

    public TransitionOptions getHeatmapRadiusTransition() {
        return nativeGetHeatmapRadiusTransition();
    }

    public void setHeatmapRadiusTransition(TransitionOptions transitionOptions) {
        nativeSetHeatmapRadiusTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public PropertyValue<Float> getHeatmapWeight() {
        return new PropertyValue("heatmap-weight", nativeGetHeatmapWeight());
    }

    public PropertyValue<Float> getHeatmapIntensity() {
        return new PropertyValue("heatmap-intensity", nativeGetHeatmapIntensity());
    }

    public TransitionOptions getHeatmapIntensityTransition() {
        return nativeGetHeatmapIntensityTransition();
    }

    public void setHeatmapIntensityTransition(TransitionOptions transitionOptions) {
        nativeSetHeatmapIntensityTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public PropertyValue<String> getHeatmapColor() {
        return new PropertyValue("heatmap-color", nativeGetHeatmapColor());
    }

    @ColorInt
    public int getHeatmapColorAsInt() {
        PropertyValue heatmapColor = getHeatmapColor();
        if (heatmapColor.isValue()) {
            return ColorUtils.rgbaToColor((String) heatmapColor.getValue());
        }
        throw new RuntimeException("heatmap-color was set as a Function");
    }

    public PropertyValue<Float> getHeatmapOpacity() {
        return new PropertyValue("heatmap-opacity", nativeGetHeatmapOpacity());
    }

    public TransitionOptions getHeatmapOpacityTransition() {
        return nativeGetHeatmapOpacityTransition();
    }

    public void setHeatmapOpacityTransition(TransitionOptions transitionOptions) {
        nativeSetHeatmapOpacityTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }
}
